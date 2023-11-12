package org.docksidestage.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.dbflute.exentity.*;

/**
 * The entity of users as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUsers extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** userId: {PK, NotNull, INT(10)} */
    protected Integer _userid;

    /** name: {NotNull, VARCHAR(30)} */
    protected String _name;

    /** email: {UQ, NotNull, VARCHAR(256)} */
    protected String _email;

    /** password: {NotNull, VARCHAR(256)} */
    protected String _password;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "users";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userid == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param email : UQ, NotNull, VARCHAR(256). (NotNull)
     */
    public void uniqueBy(String email) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("email");
        setEmail(email);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUsers) {
            BsUsers other = (BsUsers)obj;
            if (!xSV(_userid, other._userid)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userid);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userid));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_email));
        sb.append(dm).append(xfND(_password));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public Users clone() {
        return (Users)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] userId: {PK, NotNull, INT(10)} <br>
     * @return The value of the column 'userId'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserid() {
        checkSpecifiedProperty("userid");
        return _userid;
    }

    /**
     * [set] userId: {PK, NotNull, INT(10)} <br>
     * @param userid The value of the column 'userId'. (basically NotNull if update: for the constraint)
     */
    public void setUserid(Integer userid) {
        registerModifiedProperty("userid");
        _userid = userid;
    }

    /**
     * [get] name: {NotNull, VARCHAR(30)} <br>
     * @return The value of the column 'name'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] name: {NotNull, VARCHAR(30)} <br>
     * @param name The value of the column 'name'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] email: {UQ, NotNull, VARCHAR(256)} <br>
     * @return The value of the column 'email'. (basically NotNull if selected: for the constraint)
     */
    public String getEmail() {
        checkSpecifiedProperty("email");
        return _email;
    }

    /**
     * [set] email: {UQ, NotNull, VARCHAR(256)} <br>
     * @param email The value of the column 'email'. (basically NotNull if update: for the constraint)
     */
    public void setEmail(String email) {
        registerModifiedProperty("email");
        _email = email;
    }

    /**
     * [get] password: {NotNull, VARCHAR(256)} <br>
     * @return The value of the column 'password'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] password: {NotNull, VARCHAR(256)} <br>
     * @param password The value of the column 'password'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }
}
