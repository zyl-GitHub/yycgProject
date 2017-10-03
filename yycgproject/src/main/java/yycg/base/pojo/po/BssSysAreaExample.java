package yycg.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class BssSysAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BssSysAreaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAreaidIsNull() {
            addCriterion("AREAID is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("AREAID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(String value) {
            addCriterion("AREAID =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(String value) {
            addCriterion("AREAID <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(String value) {
            addCriterion("AREAID >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("AREAID >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(String value) {
            addCriterion("AREAID <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(String value) {
            addCriterion("AREAID <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLike(String value) {
            addCriterion("AREAID like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotLike(String value) {
            addCriterion("AREAID not like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<String> values) {
            addCriterion("AREAID in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<String> values) {
            addCriterion("AREAID not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(String value1, String value2) {
            addCriterion("AREAID between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(String value1, String value2) {
            addCriterion("AREAID not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("AREANAME is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("AREANAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("AREANAME =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("AREANAME <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("AREANAME >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("AREANAME >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("AREANAME <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("AREANAME <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("AREANAME like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("AREANAME not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("AREANAME in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("AREANAME not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("AREANAME between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("AREANAME not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andArealevelIsNull() {
            addCriterion("AREALEVEL is null");
            return (Criteria) this;
        }

        public Criteria andArealevelIsNotNull() {
            addCriterion("AREALEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andArealevelEqualTo(Integer value) {
            addCriterion("AREALEVEL =", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelNotEqualTo(Integer value) {
            addCriterion("AREALEVEL <>", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelGreaterThan(Integer value) {
            addCriterion("AREALEVEL >", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("AREALEVEL >=", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelLessThan(Integer value) {
            addCriterion("AREALEVEL <", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelLessThanOrEqualTo(Integer value) {
            addCriterion("AREALEVEL <=", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelIn(List<Integer> values) {
            addCriterion("AREALEVEL in", values, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelNotIn(List<Integer> values) {
            addCriterion("AREALEVEL not in", values, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelBetween(Integer value1, Integer value2) {
            addCriterion("AREALEVEL between", value1, value2, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelNotBetween(Integer value1, Integer value2) {
            addCriterion("AREALEVEL not between", value1, value2, "arealevel");
            return (Criteria) this;
        }

        public Criteria andAreafullnameIsNull() {
            addCriterion("AREAFULLNAME is null");
            return (Criteria) this;
        }

        public Criteria andAreafullnameIsNotNull() {
            addCriterion("AREAFULLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreafullnameEqualTo(String value) {
            addCriterion("AREAFULLNAME =", value, "areafullname");
            return (Criteria) this;
        }

        public Criteria andAreafullnameNotEqualTo(String value) {
            addCriterion("AREAFULLNAME <>", value, "areafullname");
            return (Criteria) this;
        }

        public Criteria andAreafullnameGreaterThan(String value) {
            addCriterion("AREAFULLNAME >", value, "areafullname");
            return (Criteria) this;
        }

        public Criteria andAreafullnameGreaterThanOrEqualTo(String value) {
            addCriterion("AREAFULLNAME >=", value, "areafullname");
            return (Criteria) this;
        }

        public Criteria andAreafullnameLessThan(String value) {
            addCriterion("AREAFULLNAME <", value, "areafullname");
            return (Criteria) this;
        }

        public Criteria andAreafullnameLessThanOrEqualTo(String value) {
            addCriterion("AREAFULLNAME <=", value, "areafullname");
            return (Criteria) this;
        }

        public Criteria andAreafullnameLike(String value) {
            addCriterion("AREAFULLNAME like", value, "areafullname");
            return (Criteria) this;
        }

        public Criteria andAreafullnameNotLike(String value) {
            addCriterion("AREAFULLNAME not like", value, "areafullname");
            return (Criteria) this;
        }

        public Criteria andAreafullnameIn(List<String> values) {
            addCriterion("AREAFULLNAME in", values, "areafullname");
            return (Criteria) this;
        }

        public Criteria andAreafullnameNotIn(List<String> values) {
            addCriterion("AREAFULLNAME not in", values, "areafullname");
            return (Criteria) this;
        }

        public Criteria andAreafullnameBetween(String value1, String value2) {
            addCriterion("AREAFULLNAME between", value1, value2, "areafullname");
            return (Criteria) this;
        }

        public Criteria andAreafullnameNotBetween(String value1, String value2) {
            addCriterion("AREAFULLNAME not between", value1, value2, "areafullname");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("PARENTID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("PARENTID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("PARENTID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("PARENTID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("PARENTID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("PARENTID like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("PARENTID not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("PARENTID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("PARENTID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("PARENTID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("PARENTID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("SHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("SHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("SHORTNAME =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("SHORTNAME <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("SHORTNAME >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNAME >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("SHORTNAME <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("SHORTNAME <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("SHORTNAME like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("SHORTNAME not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("SHORTNAME in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("SHORTNAME not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("SHORTNAME between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("SHORTNAME not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andIsunitIsNull() {
            addCriterion("ISUNIT is null");
            return (Criteria) this;
        }

        public Criteria andIsunitIsNotNull() {
            addCriterion("ISUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsunitEqualTo(String value) {
            addCriterion("ISUNIT =", value, "isunit");
            return (Criteria) this;
        }

        public Criteria andIsunitNotEqualTo(String value) {
            addCriterion("ISUNIT <>", value, "isunit");
            return (Criteria) this;
        }

        public Criteria andIsunitGreaterThan(String value) {
            addCriterion("ISUNIT >", value, "isunit");
            return (Criteria) this;
        }

        public Criteria andIsunitGreaterThanOrEqualTo(String value) {
            addCriterion("ISUNIT >=", value, "isunit");
            return (Criteria) this;
        }

        public Criteria andIsunitLessThan(String value) {
            addCriterion("ISUNIT <", value, "isunit");
            return (Criteria) this;
        }

        public Criteria andIsunitLessThanOrEqualTo(String value) {
            addCriterion("ISUNIT <=", value, "isunit");
            return (Criteria) this;
        }

        public Criteria andIsunitLike(String value) {
            addCriterion("ISUNIT like", value, "isunit");
            return (Criteria) this;
        }

        public Criteria andIsunitNotLike(String value) {
            addCriterion("ISUNIT not like", value, "isunit");
            return (Criteria) this;
        }

        public Criteria andIsunitIn(List<String> values) {
            addCriterion("ISUNIT in", values, "isunit");
            return (Criteria) this;
        }

        public Criteria andIsunitNotIn(List<String> values) {
            addCriterion("ISUNIT not in", values, "isunit");
            return (Criteria) this;
        }

        public Criteria andIsunitBetween(String value1, String value2) {
            addCriterion("ISUNIT between", value1, value2, "isunit");
            return (Criteria) this;
        }

        public Criteria andIsunitNotBetween(String value1, String value2) {
            addCriterion("ISUNIT not between", value1, value2, "isunit");
            return (Criteria) this;
        }

        public Criteria andLastupdateIsNull() {
            addCriterion("LASTUPDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastupdateIsNotNull() {
            addCriterion("LASTUPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdateEqualTo(String value) {
            addCriterion("LASTUPDATE =", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateNotEqualTo(String value) {
            addCriterion("LASTUPDATE <>", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateGreaterThan(String value) {
            addCriterion("LASTUPDATE >", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateGreaterThanOrEqualTo(String value) {
            addCriterion("LASTUPDATE >=", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateLessThan(String value) {
            addCriterion("LASTUPDATE <", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateLessThanOrEqualTo(String value) {
            addCriterion("LASTUPDATE <=", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateLike(String value) {
            addCriterion("LASTUPDATE like", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateNotLike(String value) {
            addCriterion("LASTUPDATE not like", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateIn(List<String> values) {
            addCriterion("LASTUPDATE in", values, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateNotIn(List<String> values) {
            addCriterion("LASTUPDATE not in", values, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateBetween(String value1, String value2) {
            addCriterion("LASTUPDATE between", value1, value2, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateNotBetween(String value1, String value2) {
            addCriterion("LASTUPDATE not between", value1, value2, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andYzcodeIsNull() {
            addCriterion("YZCODE is null");
            return (Criteria) this;
        }

        public Criteria andYzcodeIsNotNull() {
            addCriterion("YZCODE is not null");
            return (Criteria) this;
        }

        public Criteria andYzcodeEqualTo(String value) {
            addCriterion("YZCODE =", value, "yzcode");
            return (Criteria) this;
        }

        public Criteria andYzcodeNotEqualTo(String value) {
            addCriterion("YZCODE <>", value, "yzcode");
            return (Criteria) this;
        }

        public Criteria andYzcodeGreaterThan(String value) {
            addCriterion("YZCODE >", value, "yzcode");
            return (Criteria) this;
        }

        public Criteria andYzcodeGreaterThanOrEqualTo(String value) {
            addCriterion("YZCODE >=", value, "yzcode");
            return (Criteria) this;
        }

        public Criteria andYzcodeLessThan(String value) {
            addCriterion("YZCODE <", value, "yzcode");
            return (Criteria) this;
        }

        public Criteria andYzcodeLessThanOrEqualTo(String value) {
            addCriterion("YZCODE <=", value, "yzcode");
            return (Criteria) this;
        }

        public Criteria andYzcodeLike(String value) {
            addCriterion("YZCODE like", value, "yzcode");
            return (Criteria) this;
        }

        public Criteria andYzcodeNotLike(String value) {
            addCriterion("YZCODE not like", value, "yzcode");
            return (Criteria) this;
        }

        public Criteria andYzcodeIn(List<String> values) {
            addCriterion("YZCODE in", values, "yzcode");
            return (Criteria) this;
        }

        public Criteria andYzcodeNotIn(List<String> values) {
            addCriterion("YZCODE not in", values, "yzcode");
            return (Criteria) this;
        }

        public Criteria andYzcodeBetween(String value1, String value2) {
            addCriterion("YZCODE between", value1, value2, "yzcode");
            return (Criteria) this;
        }

        public Criteria andYzcodeNotBetween(String value1, String value2) {
            addCriterion("YZCODE not between", value1, value2, "yzcode");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNull() {
            addCriterion("VCHAR1 is null");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNotNull() {
            addCriterion("VCHAR1 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar1EqualTo(String value) {
            addCriterion("VCHAR1 =", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotEqualTo(String value) {
            addCriterion("VCHAR1 <>", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThan(String value) {
            addCriterion("VCHAR1 >", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR1 >=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThan(String value) {
            addCriterion("VCHAR1 <", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThanOrEqualTo(String value) {
            addCriterion("VCHAR1 <=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Like(String value) {
            addCriterion("VCHAR1 like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotLike(String value) {
            addCriterion("VCHAR1 not like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1In(List<String> values) {
            addCriterion("VCHAR1 in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotIn(List<String> values) {
            addCriterion("VCHAR1 not in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Between(String value1, String value2) {
            addCriterion("VCHAR1 between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotBetween(String value1, String value2) {
            addCriterion("VCHAR1 not between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNull() {
            addCriterion("VCHAR2 is null");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNotNull() {
            addCriterion("VCHAR2 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar2EqualTo(String value) {
            addCriterion("VCHAR2 =", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotEqualTo(String value) {
            addCriterion("VCHAR2 <>", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThan(String value) {
            addCriterion("VCHAR2 >", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR2 >=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThan(String value) {
            addCriterion("VCHAR2 <", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThanOrEqualTo(String value) {
            addCriterion("VCHAR2 <=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Like(String value) {
            addCriterion("VCHAR2 like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotLike(String value) {
            addCriterion("VCHAR2 not like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2In(List<String> values) {
            addCriterion("VCHAR2 in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotIn(List<String> values) {
            addCriterion("VCHAR2 not in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Between(String value1, String value2) {
            addCriterion("VCHAR2 between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotBetween(String value1, String value2) {
            addCriterion("VCHAR2 not between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNull() {
            addCriterion("VCHAR3 is null");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNotNull() {
            addCriterion("VCHAR3 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar3EqualTo(String value) {
            addCriterion("VCHAR3 =", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotEqualTo(String value) {
            addCriterion("VCHAR3 <>", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThan(String value) {
            addCriterion("VCHAR3 >", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR3 >=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThan(String value) {
            addCriterion("VCHAR3 <", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThanOrEqualTo(String value) {
            addCriterion("VCHAR3 <=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Like(String value) {
            addCriterion("VCHAR3 like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotLike(String value) {
            addCriterion("VCHAR3 not like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3In(List<String> values) {
            addCriterion("VCHAR3 in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotIn(List<String> values) {
            addCriterion("VCHAR3 not in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Between(String value1, String value2) {
            addCriterion("VCHAR3 between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotBetween(String value1, String value2) {
            addCriterion("VCHAR3 not between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar4IsNull() {
            addCriterion("VCHAR4 is null");
            return (Criteria) this;
        }

        public Criteria andVchar4IsNotNull() {
            addCriterion("VCHAR4 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar4EqualTo(String value) {
            addCriterion("VCHAR4 =", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotEqualTo(String value) {
            addCriterion("VCHAR4 <>", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4GreaterThan(String value) {
            addCriterion("VCHAR4 >", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR4 >=", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4LessThan(String value) {
            addCriterion("VCHAR4 <", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4LessThanOrEqualTo(String value) {
            addCriterion("VCHAR4 <=", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4Like(String value) {
            addCriterion("VCHAR4 like", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotLike(String value) {
            addCriterion("VCHAR4 not like", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4In(List<String> values) {
            addCriterion("VCHAR4 in", values, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotIn(List<String> values) {
            addCriterion("VCHAR4 not in", values, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4Between(String value1, String value2) {
            addCriterion("VCHAR4 between", value1, value2, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotBetween(String value1, String value2) {
            addCriterion("VCHAR4 not between", value1, value2, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar5IsNull() {
            addCriterion("VCHAR5 is null");
            return (Criteria) this;
        }

        public Criteria andVchar5IsNotNull() {
            addCriterion("VCHAR5 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar5EqualTo(String value) {
            addCriterion("VCHAR5 =", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotEqualTo(String value) {
            addCriterion("VCHAR5 <>", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5GreaterThan(String value) {
            addCriterion("VCHAR5 >", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR5 >=", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5LessThan(String value) {
            addCriterion("VCHAR5 <", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5LessThanOrEqualTo(String value) {
            addCriterion("VCHAR5 <=", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5Like(String value) {
            addCriterion("VCHAR5 like", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotLike(String value) {
            addCriterion("VCHAR5 not like", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5In(List<String> values) {
            addCriterion("VCHAR5 in", values, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotIn(List<String> values) {
            addCriterion("VCHAR5 not in", values, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5Between(String value1, String value2) {
            addCriterion("VCHAR5 between", value1, value2, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotBetween(String value1, String value2) {
            addCriterion("VCHAR5 not between", value1, value2, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar6IsNull() {
            addCriterion("VCHAR6 is null");
            return (Criteria) this;
        }

        public Criteria andVchar6IsNotNull() {
            addCriterion("VCHAR6 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar6EqualTo(String value) {
            addCriterion("VCHAR6 =", value, "vchar6");
            return (Criteria) this;
        }

        public Criteria andVchar6NotEqualTo(String value) {
            addCriterion("VCHAR6 <>", value, "vchar6");
            return (Criteria) this;
        }

        public Criteria andVchar6GreaterThan(String value) {
            addCriterion("VCHAR6 >", value, "vchar6");
            return (Criteria) this;
        }

        public Criteria andVchar6GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR6 >=", value, "vchar6");
            return (Criteria) this;
        }

        public Criteria andVchar6LessThan(String value) {
            addCriterion("VCHAR6 <", value, "vchar6");
            return (Criteria) this;
        }

        public Criteria andVchar6LessThanOrEqualTo(String value) {
            addCriterion("VCHAR6 <=", value, "vchar6");
            return (Criteria) this;
        }

        public Criteria andVchar6Like(String value) {
            addCriterion("VCHAR6 like", value, "vchar6");
            return (Criteria) this;
        }

        public Criteria andVchar6NotLike(String value) {
            addCriterion("VCHAR6 not like", value, "vchar6");
            return (Criteria) this;
        }

        public Criteria andVchar6In(List<String> values) {
            addCriterion("VCHAR6 in", values, "vchar6");
            return (Criteria) this;
        }

        public Criteria andVchar6NotIn(List<String> values) {
            addCriterion("VCHAR6 not in", values, "vchar6");
            return (Criteria) this;
        }

        public Criteria andVchar6Between(String value1, String value2) {
            addCriterion("VCHAR6 between", value1, value2, "vchar6");
            return (Criteria) this;
        }

        public Criteria andVchar6NotBetween(String value1, String value2) {
            addCriterion("VCHAR6 not between", value1, value2, "vchar6");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}