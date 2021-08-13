package IOStream.ThirdTask;

public class NoSuchLastNameStudentException extends Exception {
    public NoSuchLastNameStudentException() {
    }

    public NoSuchLastNameStudentException(String message) {
        super(message);
    }
}

