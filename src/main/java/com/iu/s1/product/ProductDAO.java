package com.iu.s1.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s1.util.DBConnection;
import com.iu.s1.util.Pager;

@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s1.product.ProductDAO.";
	
	
	//delete
	public int setProductDelete(Long productNum)throws Exception{
		      
	      return sqlSession.delete(NAMESPACE+"setProductDelete", productNum);

	   }
   
   public Long getProductNum() throws Exception {
//    
//      
//      String sql = "SELECT PRODUCT_SEQ.NEXTVAL FROM DUAL";
//      
	   return sqlSession.selectOne(NAMESPACE+"getProductNum");
      
      
   }
   public ProductDTO getProductDetail(ProductDTO productDTO) throws Exception {
//	      Connection connection = DBConnection.getConnection();
//	      String sql = "SELECT * FROM PRODUCT WHERE PRODUCT_NUM=?";
//	      PreparedStatement st = connection.prepareStatement(sql);
//	      st.setLong(1, dto.getProduct_Num());
//	      ResultSet rs = st.executeQuery();
		return sqlSession.selectOne(NAMESPACE+"getProductDetail", productDTO);
   }
   public List<ProductOptionDTO> getProductOptionList() throws Exception {
      List<ProductOptionDTO> ar = new ArrayList<ProductOptionDTO>();
      
      Connection con = DBConnection.getConnection();
      
      String sql = "SELECT * FROM PRODUCTOPTION";
      
      PreparedStatement st = con.prepareStatement(sql);
      
      ResultSet rs = st.executeQuery();
      
      while(rs.next()) {
         ProductOptionDTO productOptionDTO = new ProductOptionDTO();
         productOptionDTO.setOptionNum(rs.getInt("OPTIONNUM"));
         productOptionDTO.setProductNum(rs.getInt("PRODUCTNUM"));
         productOptionDTO.setOptionName(rs.getString("OPTIONNAME"));
         productOptionDTO.setOptionPrice(rs.getInt("OPTIONPRICE"));
         productOptionDTO.setOptionStock(rs.getDouble("OPTIONSTOCK"));
         ar.add(productOptionDTO);
      }
      
      DBConnection.disConnection(rs, st, con);
      
      return ar;
      
   }
   public int setAddProductOption(ProductOptionDTO productOptionDTO) throws Exception {
      
      Connection connection = DBConnection.getConnection();
      
      String sql = "INSERT INTO PRODUCTOPTION (OPTIONNUM, PRODUCTNUM, OPTIONNAME, OPTIONPRICE, OPTIONSTOCK) "
            + "VALUES (PRODUCT_SEQ.NEXTVAL, ?, ?, ?, ?)";
      
      PreparedStatement st = connection.prepareStatement(sql);
      st.setInt(1, productOptionDTO.getProductNum());
      st.setString(2, productOptionDTO.getOptionName());
      st.setInt(3, productOptionDTO.getOptionPrice());
      st.setDouble(4, productOptionDTO.getOptionStock());
      
      int result = st.executeUpdate();
      
      DBConnection.disConnection(st, connection);
      
      return result;
   }
   
   
   public List<ProductDTO> getProductList(Pager pager) throws Exception{
      
	   return sqlSession.selectList(NAMESPACE+"getProductList",pager);
	 }
//      ArrayList<ProductDTO> ar = new ArrayList<ProductDTO>();
      
//      Connection connection = dataSource.getConnection();
//      
//      String sql = "SELECT PRODUCT_NUM, PRODUCT_NAME, PRODUCT_JUMSU "
//            + "FROM PRODUCT ORDER BY PRODUCT_JUMSU DESC";
//      
//      PreparedStatement st = connection.prepareStatement(sql);
      
//      ResultSet rs = st.executeQuery();
      
//      while(rs.next()) {
//         ProductDTO productDTO = new ProductDTO();
//         productDTO.setProduct_Num(rs.getInt("PRODUCT_NUM"));
//         productDTO.setProduct_Name(rs.getString("PRODUCT_NAME"));
//         productDTO.setProduct_Jumsu(rs.getDouble("PRODUCT_JUMSU"));
//         ar.add(productDTO);
//         
//      }
//      DBConnection.disConnection(rs, st, connection);
      

   
   
   public int setProductAdd(ProductDTO productDTO) throws Exception {
	      
	   return  sqlSession.insert(NAMESPACE+"setProductAdd", productDTO);
	      
	   }
	   
	   
	}
      
//      Connection connection = DBConnection.getConnection();
//      
//      String sql = "INSERT INTO PRODUCT (PRODUCT_NUM, PRODUCT_NAME, PRODUCT_DETAIL, PRODUCT_JUMSU) "
//            + "VALUES (?, ?, ?, 0.0)";
//      
//      PreparedStatement st = connection.prepareStatement(sql);
//      
//      st.setLong(1, productDTO.getProduct_Num());
//      st.setString(2, productDTO.getProduct_Name());
//      st.setString(3, productDTO.getProduct_Detail());
////      st.setDouble(4, productDTO.getProductJumsu());
//      
//      int result = st.executeUpdate();
//      
//      DBConnection.disConnection(st, connection);
      
  