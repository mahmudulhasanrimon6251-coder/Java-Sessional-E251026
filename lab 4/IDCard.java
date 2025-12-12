class IDCard {
String name;
int id;
String department;
String institution;
IDCard(String n, int i, String d, String ins) {
name = n;
id = i;
department = d;
institution = ins;
}
void showID() {
System.out.println("Name: " + name);
System.out.println("ID: " + id);
System.out.println("Department: " + department);
System.out.println("Institution: " + institution);
}
public static void main(String[] args) {
IDCard myID = new IDCard("Mahmudul Hasan Rimon", 251026, "CCE", "International Islamic University Chittagong");
myID.showID();
}
}