package day04_practice_tasks;

public class HttpStatusCode {

    public static void main(String[] args) {

        int code = 503;
        String message = "";

        switch (code){

            case 200 -> message = "OK";
            case 201 -> message = "Created";
            case 202 -> message = "Accepted";
            case 301 -> message = "Moved Permanently";
            case 303 -> message = "See Other";
            case 304 -> message = "Not Modified";
            case 307 -> message = "Temporary Redirect";
            case 400 -> message = "Bad Request";
            case 401 -> message = "Unauthorized";
            case 403 -> message = "Forbidden";
            case 404 -> message = "Not Found";
            case 410 -> message = "Gone";
            case 500 -> message = "Internal Server Error";
            case 503 -> message = "Service Unavailable";

            default->message ="unknown code";
        }

        System.out.println(message);
    }
}
