FROM ruby:2.7-alpine

RUN apk add --no-cache \
    build-base \
    ruby-dev \
    libc-dev \
    linux-headers

# Update gem to a specific version and install bundler
RUN gem update --system 3.3.26 && \
    gem install bundler

# Install Jekyll 3.9.5
RUN gem install jekyll -v 3.9.5

# Set the working directory
WORKDIR /app

# Copy the Gemfile and index.Gemfile.lock
COPY Gemfile* ./

# Install project dependencies
RUN bundle install

# Copy the Jekyll site files
COPY ./wsite /app/

# Expose the port for Jekyll server (if needed)
#EXPOSE 4000

# Start Jekyll server
#CMD ["jekyll", "serve", "--force_polling", "--livereload"]
#CMD ["jekyll", "serve", "--host", "127.0.0.1", "--port", "4000", "--watch"]

