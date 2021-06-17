package BTVN;

import java.util.ArrayList;
import java.util.List;

public class ProductsManagement {
    List<Products> listProduct = new ArrayList<Products>();

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
