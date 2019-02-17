package ua.block04.trainingcod.applicationForm02.controller;

/**
 * Created on 13.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public interface RegexContainer {

    String REG_NAME = "^[A-Z]{1}[a-z]{1,15}$";
    String REG_NICKNAME = "^.{1,15}$";
    String REG_HOME_NUMBER = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    String REG_MOBILE_NUMBER1 = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    String REG_MOBILE_NUMBER2 = "^(\\+38\\(0[\\d]{2}\\)[\\d]{7})|next$";
    String REG_EMAIL = "^[a-zA-Z\\d][\\w\\.-]{0,15}@[a-zA-Z]{1,10}\\.((com|net|org)(\\.ua)?|ua|ru)$";
    String REG_SKYPE = "^[a-zA-Z\\d][\\w\\.]{0,20}$";
    String REG_POSTCODE = "^[\\d]{5}$";
    String REG_CITY = "^[A-Z]{1}[a-zA-Z]{2,15}$";
    String REG_STREET = "^[A-Z]{1}[a-z]{1,20}$";
    String REG_HOUSE_NUMBER = "^[\\d]{1,3}(\\/[\\d]{1,2})?[a-z]?$";
    String REG_APARTMENT_NUMBER = "^[\\d]{1,3}";
}
