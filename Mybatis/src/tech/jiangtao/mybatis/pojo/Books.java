/**
 * 
 */
package tech.jiangtao.mybatis.pojo;

/**    
 *  @moduleName： Mybatis   
 *  @className： Books   
 *  @description：    
 *  @author： kevin   
 *  @createTime： 2017年3月26日 上午4:24:53   
 *  @version:      
 **/
public class Books {

	private int id;
	private String bookName;
	private float bookPrice;
	private String bookNote;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the bookPrice
	 */
	public float getBookPrice() {
		return bookPrice;
	}
	/**
	 * @param bookPrice the bookPrice to set
	 */
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	/**
	 * @return the bookNote
	 */
	public String getBookNote() {
		return bookNote;
	}
	/**
	 * @param bookNote the bookNote to set
	 */
	public void setBookNote(String bookNote) {
		this.bookNote = bookNote;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Books [id=" + id + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookNote=" + bookNote
				+ "]";
	}
	
}
