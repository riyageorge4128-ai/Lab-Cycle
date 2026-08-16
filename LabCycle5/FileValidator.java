class InvalidRecordException extends Exception {
    InvalidRecordException(String message) {
        super(message);
    }
}

public class FileValidator {

    static void validate(String row) throws InvalidRecordException {
        String[] fields = row.split(",");

        // A valid row must contain exactly 3 fields.
        if (fields.length != 3) {
            throw new InvalidRecordException("Malformed row: " + row);
        }

        System.out.println("Valid row: " + row);
    }

    public static void main(String[] args) {
        String[] rows = {
                "101,Anu,50000",
                "102,Binu",
                "103,Chitra,45000"
        };

        try {
            for (String row : rows) {
                validate(row);
            }
        } catch (InvalidRecordException e) {
            System.out.println("Record error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            // No Reader/Scanner is used in this version.
            // Therefore there is no resource to close.
            System.out.println("Validation complete");
        }
    }
}
