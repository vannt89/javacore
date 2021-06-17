package BTVN;

import java.util.ArrayList;
import java.util.List;

public class ProductsMain {
    List<Products> listProduct = new ArrayList<Products>();

    /*
     * Quản lý danh sách sản phẩm bao gồm có mã sản phẩm, tên sản phẩm, số lượng , giá bán.
     * Tiến hành thêm thông tin sản phẩm, tìm kiêm sản phẩm theo tên, sửa sản phẩm, xoá sản phẩm
     */

    public static void main(String args[]) {
        ProductsMain main = new ProductsMain();
        main.addProduct(new Products(1, "SP1", 5, 50.000));
        main.addProduct(new Products(2, "SP2", 7, 70.000));
        main.addProduct(new Products(3, "SP3", 9, 90.000));
        main.addProduct(new Products(4, "SP4", 11, 110.500));

        System.out.println("Danh sách sản phẩm hiện có là: ");
        main.printProduct();


        String name1 = "SP5";
        String name2 = "SP3";
        System.out.println("\nTìm kiếm sản phẩm: " + name1);
        main.searchProductByName(name1);
        System.out.println("\nTìm kiếm sản phẩm: " + name2);
        main.searchProductByName(name2);

        main.removeProduct("SP4");
        System.out.println("Danh sách sản phẩm sau khi xoá là: ");
        main.printProduct();

        main.updateProduct("SP3", "SP3New");
        System.out.println("Danh sách sản phẩm sau khi thay đổi là: ");
        main.printProduct();
    }

    public void printProduct() {
        for (Products p : listProduct) {
            System.out.println(p);
        }
    }

    public void addProduct(Products products) {
        listProduct.add(products);
    }

    public Products searchProductByName(String name) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getProductName().equals(name)) {
                System.out.println("Thông tin sản phẩm tìm kiếm: " + listProduct.get(i));
                return listProduct.get(i);
            }
        }
        return new Products("Không có sản phẩm này");
    }

    public void removeProduct(String name) {
        System.out.println("\nXoá sản phẩm có tên là: " + name);
        Products searchedName = searchProductByName(name);
        listProduct.remove(searchedName);
    }

    public void updateProduct(String name, String newName) {
        System.out.println("\nĐổi tên sản phẩm có tên là: " + name + " thành tên mới là: " + newName);
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getProductName().equals(name)) {
                listProduct.get(i).setProductName(newName);
            }
        }
    }

}
