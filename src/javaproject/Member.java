package javaproject;

public class Member {

    /*-----------Поля класса Member---------*/
    private char memberType;
    private int memberID;
    private String name;
    private double fees;

/*-----------Конструктор класса Member---------*/
    Member(char pMemberType, int pMemberID, String pName, double pFees){
        this.memberType = pMemberType;
        this.memberID = pMemberID;
        this.name = pName;
        this.fees = pFees;
    }

/*-----------Методы класса Member---------*/
    public void setMemberType(char pMemberType){
        memberType = pMemberType;
    }
    public char getMemberType(){
        return memberType;
    }

    public void setMemberID(int pMemberID){
        memberID = pMemberID;
    }
    public int getMemberID(){
        return memberID;
    }

    public void setName(String pName){ name = pName;}
    public String getName(){
        return name;
    }

    public void setfees(double pFees){
        fees = pFees;
    }
    public double getfees(){
        return fees;
    }

    @Override
    public String toString(){
        return (memberType + ", " + memberID + ", " + ", " + name + ", " + fees);
    }

}
