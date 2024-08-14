# Create Jekyll container from a Ruby Alpine image
FROM ruby:3.1-alpine3.20

RUN apk add --no-cache \
    build-base \
    ruby-dev \
    libc-dev \
    linux-headers \
    gcc \
    make \
    git

# Verify installations
RUN ruby --version && \
    gem --version && \
    gcc --version && \
    make --version

# Update gem to a specific version and install bundler
RUN gem update --system 3.3.26 && \
    gem install bundler

# Install Jekyll 3.9.5
RUN gem install jekyll -v 4.3.2

# Set the working directory
WORKDIR /app

# Copy the Gemfile and index.Gemfile.lock
COPY Gemfile* ./docs /app/

# Install project dependencies
RUN bundle install

# Expose the port for Jekyll server (if needed)
EXPOSE 4000

# Start Jekyll server
CMD ["jekyll", "serve", "--host", "0.0.0.0", "--port", "4000", "--watch"]

