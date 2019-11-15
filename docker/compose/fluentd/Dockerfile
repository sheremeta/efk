# fluentd/Dockerfile
FROM fluent/fluentd:v1.6-debian-1
USER root
RUN ["gem", "install", "fluent-plugin-elasticsearch", "--no-document", "--version", "3.5.2"]
RUN ["gem", "install", "fluent-plugin-record-modifier", "--no-document", "--version", "2.0.0"]
RUN ["gem", "install", "fluent-plugin-prometheus", "--no-document", "--version", "1.7.0"]
USER fluent