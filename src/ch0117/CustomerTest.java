package ch0117;

import ch0115.Customer;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<ch0115.Customer> customerList = new ArrayList<ch0115.Customer>();

        ch0115.Customer customerLee = new ch0115.Customer(10010, "이순신");
        ch0115.Customer customerShin = new ch0115.Customer(10020, "신사임당");
        ch0115.Customer customerHong = new GoldCustomer(10030, "홍길동");
        ch0115.Customer customerYul = new GoldCustomer(10040, "이율곡");
        ch0115.Customer customerKim = new VIPCustomer(10050, "김유신", 12345);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);

        System.out.println("====== 고객 정보 출력 =======");

        for (ch0115.Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("====== 할인율과 보너스 포인트 계산 =======");

        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " 님이 " + +cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
        }
    }
}
