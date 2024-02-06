package model;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;

    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public  boolean addNewContact(Contact contact) {
        if(contact == null || contact.getName() == null || contact.getPhoneNumber() == null) {
            return false;
        }
        if(findContact(contact.getName())>= 0){
            return false;
        }
        this.myContacts.add(contact);
        return  true;
    }

    public int findContact(String name) {
        for(int i = 0; i<myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if(contact.getName().equalsIgnoreCase((name))){
                return i;
            }
        }
        return  -1;
    }
    public   int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int oldContactIndex = findContact(oldContact);
        if(oldContactIndex<0){
            return false;
        }
        this.myContacts.set(oldContactIndex,newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        if(findContact(contact)<0){
            return false;
        }
        this.myContacts.remove(contact);
        return  true;
    }
    public  Contact queryContact(String contactName){
        int contactIndex= findContact(contactName);
        if(contactIndex<0){
            return null;
        }
        return  this.myContacts.get(contactIndex);
    }
    public void printContacts(){
        for(int i= 0; i<this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            System.out.println((i+1) + ". elemandaki " + contact.getName() + "isimli kulllanıcının numarası " + contact.getPhoneNumber());

        }
    }
}