// CLASS TO CANCEL TICKET
class TicketCancellation {

    void cancelTicket(PersonDetails dt, String nameToCancel) {

        int index = dt.name.indexOf(nameToCancel);

        if (index == -1) {

            System.out.println("Passenger not found!");

        } else {

            dt.name.remove(index);
            dt.age.remove(index);
            dt.gender.remove(index);
            dt.contactNo.remove(index);
            dt.occupation.remove(index);
            dt.tripType.remove(index);
            dt.journeyDate.remove(index);
            dt.journeyTime.remove(index);

            System.out.println("Ticket cancelled successfully for " + nameToCancel);
            System.out.println("============================================================");
        }
    }
}