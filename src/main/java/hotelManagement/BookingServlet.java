package hotelManagement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class BookingServlet
 */
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}






//
//
//package hotelManagement;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//
//@WebServlet("/booking")
//public class BookingServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public BookingServlet() {
//        super();
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.getWriter().append("Served at: ").append(request.getContextPath());
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // Retrieve booking information from request parameters
//        String bookingId = request.getParameter("bookingId");
//        String roomId = request.getParameter("roomId");
//        String customerId = request.getParameter("customerId");
//        String serviceId = request.getParameter("serviceId");
//
//        // Create a new Booking object
//        Booking newBooking = new Booking(bookingId, roomId, customerId, serviceId);
//
//        // Perform booking
//        boolean bookingSuccess = performBooking(newBooking);
//
//        if (bookingSuccess) {
//            // Booking successful
//            response.getWriter().write("Booking successful!");
//        } else {
//            // Booking failed
//            response.getWriter().write("Booking failed. Please try again.");
//        }
//    }
//
//    private boolean performBooking(Booking newBooking) {
//        String fullPath = getServletContext().getRealPath("/hms.json");
//        JsonObject jsonObject;
//        JsonArray bookingsArray;
//
//        // Read existing bookings from JSON file
//        try (BufferedReader reader = new BufferedReader(new FileReader(fullPath))) {
//            JsonParser parser = new JsonParser();
//            jsonObject = parser.parse(reader).getAsJsonObject();
//            bookingsArray = jsonObject.getAsJsonArray("bookings");
//        } catch (IOException e) {
//            e.printStackTrace();
//            return false;
//        }
//
//        // Add new booking to bookingsArray
//        JsonObject bookingObject = new JsonObject();
//        bookingObject.addProperty("bookingId", newBooking.getBookingId());
//        bookingObject.addProperty("roomId", newBooking.getRoomId());
//        bookingObject.addProperty("customerId", newBooking.getCustomerId());
//        bookingObject.addProperty("serviceId", newBooking.getServiceId());
//        bookingsArray.add(bookingObject);
//
//        // Write updated bookings to JSON file
//        try (FileWriter writer = new FileWriter(fullPath)) {
//            jsonObject.add("bookings", bookingsArray);
//            writer.write(jsonObject.toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//            return false;
//        }
//
//        return true;
//    }
//}
