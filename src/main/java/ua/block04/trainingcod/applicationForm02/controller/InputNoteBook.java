package ua.block04.trainingcod.applicationForm02.controller;

import ua.block04.trainingcod.applicationForm02.model.Model;
import ua.block04.trainingcod.applicationForm02.view.View;

/**
 * Created on 13.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class InputNoteBook {

    View view;
    Model model;
    UtilityController utilityController;

    private String name;
    private String surname;
    private String patronymic;
    private String nickName;
    private String comment;
    private String homePhoneNumber;
    private String mobilePhoneNumber1;
    private String mobilePhoneNumber2;
    private String email;
    private String skype;
    private String postcode;
    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;
    private String homeAddress;
    private String dateOfCreation;

    public InputNoteBook(View view, Model model, UtilityController utilityController) {
        this.view = view;
        this.model = model;
        this.utilityController = utilityController;
    }

    public void saveDateToModel() {
        model.setName(name);
    }
}
