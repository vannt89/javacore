package BTVN;

import java.util.ArrayList;
import java.util.List;

public class ProductsMain {
    /*
     * Quản lý danh sách sản phẩm bao gồm có mã sản phẩm, tên sản phẩm, số lượng , giá bán.
     * Tiến hành thêm thông tin sản phẩm, tìm kiêm sản phẩm theo tên, sửa sản phẩm, xoá sản phẩm
     */

    public static void main(String args[]) {
        ProductsManagement pro = new ProductsManagement();
        pro.addProduct(new Products(1, "SP1", 5, 50.000));
        pro.addProduct(new Products(2, "SP2", 7, 70.000));
        pro.addProduct(new Products(3, "SP3", 9, 90.000));
        pro.addProduct(new Products(4, "SP4", 11, 110.500));

        System.out.println("Danh sách sản phẩm hiện có là: ");
        pro.printProduct();


        String name1 = "SP5";
        String name2 = "SP3";
        System.out.println("\nTìm kiếm sản phẩm: " + name1);
        pro.searchProductByName(name1);
        System.out.println("\nTìm kiếm sản phẩm: " + name2);
        pro.searchProductByName(name2);

        pro.removeProduct("SP4");
        System.out.println("Danh sách sản phẩm sau khi xoá là: ");
        pro.printProduct();

        pro.updateProduct("SP3", "SP3New");
        System.out.println("Danh sách sản phẩm sau khi thay đổi là: ");
        pro.printProduct();
    }


}
