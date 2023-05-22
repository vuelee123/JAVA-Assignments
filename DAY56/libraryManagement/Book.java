package DAY56.libraryManagement;
public class Book {
        private String title;
        private String author;
        private int publicationYear;
        private int pages;
        private String category;
        private boolean isOnLoan;
        public Book(String title, String author, int publicationYear, int pages, String category, boolean isOnLoan) {
                this.title = title;
                this.author = author;
                this.publicationYear = publicationYear;
                this.pages = pages;
                this.category = category;
                this.isOnLoan = isOnLoan;
        }
                public String getTitle() {
                        return title;
                }

                public String getAuthor() {
                        return author;
                }

                public int getPublicationYear() {
                        return publicationYear;
                }

                public int getPages() {
                        return pages;
                }

                public String getCategory() {
                        return category;
                }

                public boolean isOnLoan() {
                        return isOnLoan;
                }

                public void setOnLoan(boolean onLoan) {
                        isOnLoan = onLoan;
                }
        public boolean getPublishDate() {
                return false;
        }

        public boolean getAvailable() {
                return false;
        }
}