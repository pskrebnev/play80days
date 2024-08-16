# Create Jekyll container from a Ruby Alpine image
FROM ruby:3.1-alpine3.20

# Environment variables for locale
ENV LC_ALL=C.UTF-8 LANG=en_US.UTF-8 LANGUAGE=en_US.UTF-8

RUN apk add --no-cache --update \
    build-base \
    ruby-dev \
    libc-dev \
    linux-headers \
    gcc \
    make \
    git \
    libxml2-dev \
    libxslt-dev \
    openssl-dev \
    libffi-dev \
    zlib-dev \
    yaml-dev

# Verify installations
RUN ruby --version && \
    gem --version && \
    gcc --version && \
    make --version

# Update gem to a specific version and install bundler
RUN gem update --system 3.3.26 && \
    gem install bundler

# Install Jekyll 4.3.2
RUN gem install jekyll -v 3.9.5

# Set the working directory
WORKDIR /usr/src/app

# Copy the Gemfile and index.Gemfile.lock
COPY Gemfile* ./docs /usr/src/app/

# Install project dependencies
RUN bundle install

# Expose the port for Jekyll server (if needed)
EXPOSE 4000

# Start Jekyll server
CMD ["jekyll", "serve", "--host", "0.0.0.0", "--port", "4000", "--watch"]

