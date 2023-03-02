/*
 * package com.iu.s1.product;
 * 
 * import static org.junit.Assert.*;
 * 
 * import java.util.List; import java.util.Random;
 * 
 * import org.junit.Test; import
 * org.springframework.beans.factory.annotation.Autowired;
 * 
 * import com.iu.s1.MyTestCase; import com.iu.s1.bankbook.BankBookDTO; import
 * com.iu.s1.util.Pager;
 * 
 * public class ProductDAOTest extends MyTestCase{
 * 
 * @Autowired private ProductDAO productDAO;
 * 
 * @Test public void getProductListTest(Pager pager) throws Exception {
 * List<ProductDTO> ar = productDAO.getProductList(pager); //단정문
 * assertNotEquals(0, ar.size()); }
 * 
 * @Test public void getProductDetailTest() throws Exception{ ProductDTO
 * productDTO = new ProductDTO(); productDTO.setProductNum(11L); productDTO =
 * productDAO.getProductDetail(productDTO); assertNotNull(productDTO); }
 * 
 * //insert
 * 
 * @Test public void setProductAddTest() throws Exception{
 * 
 * for(int i=0; i<30; i++) { Random r = new Random(); double d =
 * r.nextDouble();//0.1234 int num = (int)(d*1000);//123.4 d = num/100.0;
 * 
 * BankBookDTO bankBookDTO= new BankBookDTO();
 * bankBookDTO.setBookName("아침적금"+i); bankBookDTO.setBookRate(d);
 * bankBookDTO.setBookSale(1);
 * 
 * } System.out.println("Finish"); }
 * 
 * }
 */
