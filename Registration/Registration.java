class Registration {
    private String customerName;
    private String passportNumber;
    private String licenseNumber;
    private String panCardNumber;
    private String voterId;
    private String[] telephoneNumbers;

    // Constructor for Passport
    public Registration(String customerName, String passportNumber, String[] telephoneNumbers) {
        this.customerName = customerName;
        this.passportNumber = passportNumber;
        this.telephoneNumbers = telephoneNumbers;
    }

    // Constructor for other ID combinations
    public Registration(String customerName, String id1, String id2, String[] telephoneNumbers) {
        this.customerName = customerName;

        if (isLicense(id1)) {
            this.licenseNumber = id1;
        } else if (isVoterId(id1)) {
            this.voterId = id1;
        } else if (isPanCard(id1)) {
            this.panCardNumber = id1;
        }

        if (isLicense(id2)) {
            this.licenseNumber = id2;
        } else if (isVoterId(id2)) {
            this.voterId = id2;
        } else if (isPanCard(id2)) {
            this.panCardNumber = id2;
        }

        this.telephoneNumbers = telephoneNumbers;
    }

    private boolean isLicense(String id) {
        return id.matches("^[0-9]{3}$");
    }

    private boolean isVoterId(String id) {
        return id.matches("^[0-9]{5}$");
    }

    private boolean isPanCard(String id) {
        return id.matches("^[A-Z]{2}[0-9]{4}$");
    }

    public void displayDetails() {
        System.out.println("Congratulations " + customerName + "!!! you have been successfully registered for our services with the following details:");

        if (passportNumber != null) {
            System.out.println("Passport number: " + passportNumber);
        } else {
            if (licenseNumber != null) {
                System.out.println("License number: " + licenseNumber);
            }
            if (panCardNumber != null) {
                System.out.println("Pan card number: " + panCardNumber);
            }
            if (voterId != null) {
                System.out.println("Voter id: " + voterId);
            }
        }

        System.out.println("Phone numbers:");
        for (String phoneNumber : telephoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
}
