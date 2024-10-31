package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(id = "login-item")
    public WebElement signInOption;

    @FindBy(xpath = "//a[@href='/account/register']")
    public WebElement registerOption;

    @FindBy(id = "entity-menu")
    public WebElement itemsAndTitles;

    @FindBy(linkText = "Room")
    public WebElement roomOption;

    @FindBy(xpath = "//span[.='Administration']")
    public WebElement administration;

    @FindBy(xpath = "//span[.='User management']")
    public WebElement userManagementLink;



    // -----------zeynep---------------
    @FindBy(xpath = "(//*[@data-icon='user'])[2]")
    public WebElement userIconName;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOut;


    @FindBy(xpath = "//*[.='MY PAGES']")
    public WebElement myPagesButton;

    @FindBy(xpath = "//*[.='My Appointments']")
    public WebElement myAppointmentsButton;




//----------Mert-----------------

    @FindBy(id = "firstName")
    public WebElement firstNameInputForAppointment;

    @FindBy(xpath = "//*[.='Your FirstName is required.']")
    public WebElement firstNameWarningMessage;

    @FindBy(id = "lastName")
    public WebElement lastNameInputForAppointment;

    @FindBy(xpath = "//*[.='Your LastName is required.']")
    public WebElement lastNameWarningMessage;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnInputForAppointment;

    @FindBy(xpath = "//*[.='Your SSN is required.']")
    public WebElement SSNWarningMessage;

    @FindBy(id = "email")
    public WebElement emailInputForAppointment;

    @FindBy(xpath = "//*[.='Your email is required.']")
    public WebElement emailWarningMessage;

    @FindBy(id = "phone")
    public WebElement phoneNumberInputForAppointment;

    @FindBy(xpath = "//*[.='Phone number is required.']")
    public WebElement phoneNumberWarningMessage;

    @FindBy(xpath = "//*[.='Phone number is invalid']")
    public WebElement phoneNumberInvalidMessage;

    @FindBy(id = "appoDate")
    public WebElement dateInputForAppointment;

    @FindBy(id = "register-submit")
    public WebElement sendAnAppointmentRequestButton;

    @FindBy(xpath = "//*[.='MY PAGES(PATIENT)']")
    public WebElement myPagesButtonPatient;

    @FindBy(xpath = "(//*[.='Make an Appointment'])[1]")
    public WebElement makeAnAppointmentLinkPatient;



    //------------------ US_27 -----------------
    @FindBy(xpath = "//span[.='CONTACT']")
    public WebElement contactIcon;

    //------------------ US_19 -----------------
    @FindBy(xpath = "//span[.='Physician']")
    public WebElement physicianLink;



    //------------------ US_20 -----------------
    @FindBy(xpath = "(//span[.='Staff'])[1]")
    public WebElement staffLink;

    @FindBy(xpath = "(//span[.='Country'])[1]")
    public WebElement countryLink;


    @FindBy(xpath = "(//span[.='State/City'])[1]")
    public WebElement stateOrCityLink;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement snnRegister;

    @FindBy(id = "firstName")
    public WebElement firstNameRegister;

    @FindBy(id = "lastName")
    public WebElement lastNameRegister;

    @FindBy(id = "username")
    public WebElement usernameRegister;

    @FindBy(id = "email")
    public WebElement emailRegister;

    @FindBy(id = "firstPassword")
    public WebElement newPasswordRegister;

    @FindBy(id = "secondPassword")
    public WebElement confirmPasswordRegister;

    @FindBy(id = "register-submit")
    public WebElement registerButtonRegister;

    @FindBy(xpath = "//div[@style='pointer-events: none;']")
    public WebElement registerDone;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement invalidSsnField;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement invalidNameField;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement invalidUsernameField;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement invalidEmailField;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement requiredEmailField;


    @FindBy(id = "strength")
    public WebElement passwordStrength;

    @FindBy(xpath = "(//*[@class='point'])[1]")
    public  WebElement passwordStrengthLevel1;


    @FindBy(xpath = "(//*[@class='point'])[2]")
    public  WebElement passwordStrengthLevel2;


    @FindBy(xpath = "(//*[@class='point'])[3]")
    public  WebElement passwordStrengthLevel3;


    @FindBy(xpath = "(//*[@class='point'])[4]")
    public  WebElement passwordStrengthLevel4;


    @FindBy(xpath = "(//*[@class='point'])[5]")
    public  WebElement passwordStrengthLevel5;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public  WebElement invalidFeedbackPassword;








    //    ********************** US_21 ********************
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement registerSuccessMessage;


    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "rememberMe")
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = " //button[@type='submit']")
    public WebElement signInSubmitButton;

//---------zeynep----------------

    @FindBy(xpath = "//span[.='Register a new account']")
    public WebElement registerANewAccountLink;

    @FindBy(xpath = "//span[.='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//*[.='Failed to sign in!']")
    public WebElement failedSigninMessage;

    @FindBy(xpath = "//*[text()='SIGN IN AGAIN']")
    public WebElement SigninAgain;

    @FindBy(xpath = "//span[.='Edit'][1]")
    public WebElement editButton;

    @FindBy(xpath = "//span[.='Create or Edit an Appointment']")
    public WebElement createOrEditAnAppointmentText;

    @FindBy(id = "appointment-id")
    public WebElement appointmentId;

    @FindBy(id = "appointment-startDate")
    public WebElement appointmentStartDate;

    @FindBy(id = "appointment-endDate")
    public WebElement appointmentEndDate;

    @FindBy(id = "appointment-status")
    public WebElement appointmentStatus;

    @FindBy(id = "appointment-physician")
    public WebElement appointmentPhysician;

    @FindBy(id = "appointment-anamnesis")
    public WebElement appointmentAnamnesis;

    @FindBy(id = "appointment-treatment")
    public WebElement appointmentTreatment;

    @FindBy(id = "appointment-diagnosis")
    public WebElement appointmentDiagnosis;

    @FindBy(id = "appointment-prescription")
    public WebElement appointmentPrescription;

    @FindBy(id = "appointment-description")
    public WebElement appointmentDescription;

    @FindBy(id= "save-entity")
    public WebElement saveButton;

    @FindBy(xpath= "//div[.='This field is required.']")
    public WebElement thisFieldIsRequiredText;

    @FindBy(xpath= "//option[.='COMPLETED']")
    public WebElement statusCompleted;

    @FindBy(xpath= "//option[.='PENDING']")
    public WebElement statusPending;

    @FindBy(xpath= "//option[.='CANCELLED']")
    public WebElement statusCancelled;

    @FindBy(xpath= "//option[.='UNAPPROVED']")
    public WebElement statusUnapproved;

    @FindBy(id = "appointment-heading")
    public WebElement appointmentHeading;


    @FindBy(xpath = "//table//tbody//tr//td[5]")
    public WebElement anamnesisText;

    @FindBy(xpath = "//table//tbody//tr//td[6]")
    public WebElement treatmentText;

    @FindBy(xpath = "//table//tbody//tr//td[7]")
    public WebElement diagnosisText;

    @FindBy(xpath = "//table//tbody//tr//td[4]")
    public WebElement statusText;


    //------------------------------------------
    @FindBy(xpath = "//a[@href='/physician_test/3616']")
    public WebElement requestATestButton;

    @FindBy(id = "1754")
    public WebElement glucoseCheckmark;

    @FindBy(xpath = "//input[@id='1755']")
    public WebElement ureaCheckmark;

    @FindBy(xpath = "//input[@id='1756']")
    public WebElement creatinineCheckmark;

    @FindBy(xpath = "//input[@id='1757']")
    public WebElement sodiumCheckmark;

    @FindBy(xpath = "//input[@id='1758']")
    public WebElement potassiumCheckmark;

    @FindBy(xpath = "//input[@id='1759']")
    public WebElement totalProteinCheckmark;

    @FindBy(xpath = "//input[@id='1760']")
    public WebElement albuminCheckmark;

    @FindBy(xpath = "//input[@id='1761']")
    public WebElement hemoglobinCheckmark;


    @FindBy(xpath = "//span[.='My Inpatients']")
    public WebElement myInpatientButton;

    @FindBy(xpath = "(//span[.='Edit'])[1]")
    public WebElement patientEditButtonInpatient;

    @FindBy(xpath = "//label[@for='in-patient-id']")
    public WebElement inpatientId;

    @FindBy(xpath = "//label[@for='in-patient-startDate']")
    public WebElement inpatientStartDate;

    @FindBy(xpath = "//label[@for='in-patient-endDate']")
    public WebElement inpatientEndDate;

    @FindBy(xpath = "//label[@for='in-patient-description']")
    public WebElement inpatientDescription;

    @FindBy(xpath = "//label[@for='in-patient-createdDate']")
    public WebElement inpatientCreatedDate;

    @FindBy(xpath = "//label[@for='in-patient-appointment']")
    public WebElement inpatientAppointment;

    @FindBy(xpath = "//label[@for='in-patient-status']")
    public WebElement inpatientStatus;

    @FindBy(xpath = "//label[@for='in-patient-room']")
    public WebElement inpatientRoom;

    @FindBy(xpath = "//label[@for='in-patient-patient']")
    public WebElement inpatientPatient;

    @FindBy(xpath = "//select[@id='in-patient-status']")
    public WebElement inpatientDropdownStatus;


    @FindBy(xpath = "//option[@value='UNAPPROVED']")
    public WebElement inpatientStatusUnapproved;

    @FindBy(xpath = "//select[@id='in-patient-status']")
    public WebElement inpatientStatus2;


    @FindBy(xpath = "//select[@name='room.id']")
    public WebElement inpatientRoomUpdate;

    @FindBy(xpath = "//option[@value='5507']")
    public WebElement inpatientRoomTwinFull;












    //------------------------------for https://medunna.com/physician-appointment page---------------------------------------------------------------------

    @FindBy(xpath = "(//span[.='Edit'])[7]")
    public WebElement editAppoToSeeTestResultsButton;

    @FindBy(linkText = "Show Test Results")
    public WebElement showTestResultsButton;

    @FindBy(xpath = "(//span[.='View Results'])[1]")
    public WebElement viewResultsButton;

    @FindBy(xpath = "//th")
    public List<WebElement> testResultHeadingList;

    @FindBy(xpath = "//button[text()='Request Inpatient']")
    public WebElement requestInpatientButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement inpatientRequestSuccessMessage;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement inpatientRequestFailureMessage;


























    //------------------------------for https://medunna.com/physician-appointment page---------------------------------------------------------------------
    @FindBy(id="fromDate")
    public WebElement appointmentFromInput;

    @FindBy(id="toDate")
    public WebElement appointmentToInput;




    //---------------zeynep------------

    @FindBy(id = "fromDate")
    public WebElement fromInput;

    @FindBy(id = "toDate")
    public WebElement toInput;

    @FindBy(xpath = "//span[text()='from']")
    public WebElement fromText;

    @FindBy(xpath = "//span[text()='to']")
    public WebElement toText;


    @FindBy(xpath = "//*[@class='table']//th")
    public List<WebElement> appointmentTable;

    @FindBy(xpath = "//table[@class='table']//td")
    public List<WebElement> testsTableBodyItems;

    @FindBy(xpath = "//*[text()='Edit']")
    public List<WebElement> editButtons;

    @FindBy(xpath = " //span[.='Test Results']")
    public WebElement testResultsText;

    @FindBy(xpath = "//table[@class='table']//td")
    public List<WebElement> testResultsTableBodyItems;




}
