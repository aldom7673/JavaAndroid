package com.example.sharingapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.UUID;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ContactList {
    private ArrayList<Contact> contacts;
    private String FILENAME = "contacts.sav";;

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public ContactList(){
        contacts = new ArrayList<Contact>();
    }

    public ArrayList<String> getAllUsernames(){
        ArrayList<String> allUserNames = new ArrayList<String>();

        for(Contact c : contacts){
            allUserNames.add( c.getUsername() );
        }

        return allUserNames;
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void deleteContact(Contact contact){
        contacts.remove(contact);
    }

    public Contact getContact(int index){
        return contacts.get(index);
    }

    public int getSize(){
        return contacts.size();
    }

    public int getIndex(Contact contact){
        int pos = 0;
        for (Contact c : contacts) {
            if (contact.getId().equals(c.getId())) {
                return pos;
            }
            pos = pos+1;
        }
        return -1;
    }

    public boolean hasContact(Contact contact){
        return contacts.contains(contact);
        /*for (Contact c : contacts) {
            if (contact.getId().equals(c.getId())) {
                return true;
            }
        }
        return false;*/
    }

    public Contact getContactByUsername(String username){
        for (Contact c : contacts) {
            if (username.equals(c.getUsername())) {
                return c;
            }
        }
        return new Contact(UUID.randomUUID().toString(), "alldo", "a@gmail.com");
    }

    public void loadContacts(Context context){
        try {
            FileInputStream fis = context.openFileInput(FILENAME);
            InputStreamReader isr = new InputStreamReader(fis);
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Contact>>() {}.getType();
            contacts = gson.fromJson(isr, listType); // temporary
            fis.close();
        } catch (FileNotFoundException e) {
            contacts = new ArrayList<Contact>();
        } catch (IOException e) {
            contacts = new ArrayList<Contact>();
        }
    }

    public void saveContacts(Context context){
        try {
            FileOutputStream fos = context.openFileOutput(FILENAME, 0);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Gson gson = new Gson();
            gson.toJson(contacts, osw);
            osw.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isUsernameAvailable(String username){
        for(Contact c : contacts){
            if( username.equals(c.getUsername())){
                return false;
            }
        }
        return true;
    }
}
