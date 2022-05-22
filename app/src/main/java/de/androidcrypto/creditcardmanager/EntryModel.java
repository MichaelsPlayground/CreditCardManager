package de.androidcrypto.creditcardmanager;

public class EntryModel {
    // version 2 for credit card manager
    //private String entryName; // takes a name like 'HVB Visa debit white'
    private String getEntryCardNumberShort; // takes the cc nr like 1234 xxxx xxxx xxxx (only first 4 digits are shown
    private String entryCardNumber; // ENCRYPTION // takes the cc nr like xxxx xxxx xxxx xxxx
    private String entryCardPin; // ENCRYPTION // 4 digit code
    private String entryCardExpiration; // takes a String like 2023-05
    private String entryCardCvc; // ENCRYPTION // 3 digit code
    //private String entryFavourite; // 0 = no favourite, 1 = favourite
    private String entryCardActive; // 0 = not (longer) active, 1 = active
    private String entryCardLabel; // taken from nfc import
    private String entryCardScheme;   // taken from nfc import
    //private String entryReserved;
    //private String entryId;

    // version 1
    private String entryName;
    private String entryLoginName;
    private String entryLoginPassword;
    private String entryCategory;
    private String entryFavourite; // 0 = no favourite, 1 = favourite
    private String entryExpired; // 0 = not expired, 1 = expired
    private String entryReserved;
    private String entryId;

    // constructor
    public EntryModel(String entryName, String entryLoginName, String entryLoginPassword, String entryCategory, String entryFavourite, String entryExpired, String entryReserved, String entryId) {
        this.entryName = entryName;
        this.entryLoginName = entryLoginName;
        this.entryLoginPassword = entryLoginPassword;
        this.entryCategory = entryCategory;
        this.entryFavourite = entryFavourite;
        this.entryExpired = entryExpired;
        this.entryReserved = entryReserved;
        this.entryId = entryId;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    public String getEntryLoginName() {
        return entryLoginName;
    }

    public void setEntryLoginName(String entryLoginName) {
        this.entryLoginName = entryLoginName;
    }

    public String getEntryLoginPassword() {
        return entryLoginPassword;
    }

    public void setEntryLoginPassword(String entryLoginPassword) {
        this.entryLoginPassword = entryLoginPassword;
    }

    public String getEntryCategory() {
        return entryCategory;
    }

    public void setEntryCategory(String entryCategory) {
        this.entryCategory = entryCategory;
    }

    public String getEntryFavourite() {
        return entryFavourite;
    }

    public void setEntryFavourite(String entryFavourite) {
        this.entryFavourite = entryFavourite;
    }

    public String isEntryExpired() {
        return entryExpired;
    }

    public void setEntryExpired(String entryExpired) {
        this.entryExpired = entryExpired;
    }

    public String getEntryReserved() {
        return entryReserved;
    }

    public void setEntryReserved(String entryReserved) {
        this.entryReserved = entryReserved;
    }

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(int id) {
        this.entryId = entryId;
    }
}
