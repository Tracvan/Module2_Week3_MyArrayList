public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>();

        // Thêm phần tử vào danh sách
        myList.add(0, "Apple");
        myList.add(1,"Banana");
        myList.add(2,"Orange");
        myList.add(3,"Mango");

        // In ra kích thước danh sách
        System.out.println("Size of myList: " + myList.size());

        // In ra danh sách
        System.out.println("myList: " + myList.toString());

        // Thêm phần tử vào vị trí cụ thể
        myList.add(2, "Grapes");

        // In ra danh sách sau khi thêm phần tử
        System.out.println("myList after adding element: " + myList.toString());

        // Xóa phần tử từ danh sách và lấy giá trị bị xóa
        String removedElement = myList.remove(1);
        System.out.println("Removed element: " + removedElement);

        // In ra danh sách sau khi xóa phần tử
        System.out.println("myList after removing element: " + myList.toString());

        // Kiểm tra xem danh sách có chứa phần tử "Apple" hay không
        boolean containsApple = myList.contains("Apple");
        System.out.println("myList contains 'Apple': " + containsApple);

        // Lấy vị trí của phần tử "Orange" trong danh sách
        int indexOfOrange = myList.indexOf("Orange");
        System.out.println("Index of 'Orange': " + indexOfOrange);

        // Lấy phần tử tại vị trí 3 trong danh sách
        String elementAtPosition3 = myList.get(3);
        System.out.println("Element at position 3: " + elementAtPosition3);

        // Xóa tất cả phần tử trong danh sách
        myList.clear();

        // In ra kích thước danh sách sau khi xóa
        System.out.println("Size of myList after clearing: " + myList.size());
    }
}