package Library_Management_System;
import java.util.Arrays;
public class Librarymanagement {

        // Linear search to find a book by title
        public static Book linearSearchByTitle(Book[] books, String title) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    return book;
                }
            }
            return null;
        }
        
        // Binary search to find a book by title (assuming sorted list)
        public static Book binarySearchByTitle(Book[] books, String title) {
                int low = 0;
                int high = books.length - 1;
        
                while (low <= high) {
                    int mid = (low + high) / 2;
                    int comparison = books[mid].getTitle().compareToIgnoreCase(title);
        
                    if (comparison == 0) {
                        return books[mid];
                    } else if (comparison < 0) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                return null;
            }
        
            // Ensure the array is sorted by title before performing binary search
            public static void sortBooksByTitle(Book[] books) {
                Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
            }
                
}
