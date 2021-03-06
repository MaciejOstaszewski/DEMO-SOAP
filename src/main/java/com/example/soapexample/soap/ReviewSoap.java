//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.28 at 09:00:22 AM CEST 
//


package com.example.soapexample.soap;

import com.example.soapexample.mapper.Soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for reviewSoap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reviewSoap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="movieId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;element name="likedMovies" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;/sequence>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reviewSoap", propOrder = {
    "id",
    "content",
    "creationDate",
    "movieId",
    "likedMovies",
    "author"
})
public class ReviewSoap implements Soap {


    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long id;
    @XmlElement(required = true)
    protected String content;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    protected long movieId;
    @XmlElement(type = Long.class)
    protected List<Long> likedMovies;
    protected long author;

    public void setLikedMovies(List<Long> likedMovies) {
        this.likedMovies = likedMovies;
    }
    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the movieId property.
     * 
     */
    public long getMovieId() {
        return movieId;
    }

    /**
     * Sets the value of the movieId property.
     * 
     */
    public void setMovieId(long value) {
        this.movieId = value;
    }

    /**
     * Gets the value of the likedMovies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the likedMovies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLikedMovies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getLikedMovies() {
        if (likedMovies == null) {
            likedMovies = new ArrayList<Long>();
        }
        return this.likedMovies;
    }

    /**
     * Gets the value of the author property.
     * 
     */
    public long getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     */
    public void setAuthor(long value) {
        this.author = value;
    }

}
