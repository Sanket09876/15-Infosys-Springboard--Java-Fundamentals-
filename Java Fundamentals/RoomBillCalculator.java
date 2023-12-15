public class RoomBillCalculator {
public static double calculateTotalBill(String roomType, int noOfDaysOfStay, int noOfExtraPerson) {
// Define the base room fare for different room types
double baseRoomFare = 0;
if (roomType.equals("standard")) {
baseRoomFare = 2500;
} else if (roomType.equals("delux")) {
baseRoomFare = 3500;
} else if (roomType.equals("cottage")) {
baseRoomFare = 5500;
} else {
System.out.println("Invalid room type!");
return 0;
}

// Define the components of the room bill
double tax = 0.12;
int extraPersonCharges = 500;
int foodCharges = 800;

// Calculate the total bill
double totalBill = (noOfDaysOfStay * baseRoomFare) + (noOfDaysOfStay * foodCharges)
+ (noOfExtraPerson * extraPersonCharges);
totalBill = totalBill + (tax * totalBill);

return totalBill;
}

public static void main(String[] args) {
String roomType = "delux";
int noOfDaysOfStay = 5;
int noOfExtraPerson = 2;

double totalBill = calculateTotalBill(roomType, noOfDaysOfStay, noOfExtraPerson);
System.out.println("Total Bill: $" + totalBill);
}
}