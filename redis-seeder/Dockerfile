FROM alpine
RUN apk --update add redis bash
COPY movies.redis .
COPY seeder.sh .
CMD ["sh", "./seeder.sh"]