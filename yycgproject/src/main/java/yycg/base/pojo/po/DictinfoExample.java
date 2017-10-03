package yycg.base.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DictinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictinfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDictcodeIsNull() {
            addCriterion("DICTCODE is null");
            return (Criteria) this;
        }

        public Criteria andDictcodeIsNotNull() {
            addCriterion("DICTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDictcodeEqualTo(String value) {
            addCriterion("DICTCODE =", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeNotEqualTo(String value) {
            addCriterion("DICTCODE <>", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeGreaterThan(String value) {
            addCriterion("DICTCODE >", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DICTCODE >=", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeLessThan(String value) {
            addCriterion("DICTCODE <", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeLessThanOrEqualTo(String value) {
            addCriterion("DICTCODE <=", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeLike(String value) {
            addCriterion("DICTCODE like", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeNotLike(String value) {
            addCriterion("DICTCODE not like", value, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeIn(List<String> values) {
            addCriterion("DICTCODE in", values, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeNotIn(List<String> values) {
            addCriterion("DICTCODE not in", values, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeBetween(String value1, String value2) {
            addCriterion("DICTCODE between", value1, value2, "dictcode");
            return (Criteria) this;
        }

        public Criteria andDictcodeNotBetween(String value1, String value2) {
            addCriterion("DICTCODE not between", value1, value2, "dictcode");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNull() {
            addCriterion("TYPECODE is null");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNotNull() {
            addCriterion("TYPECODE is not null");
            return (Criteria) this;
        }

        public Criteria andTypecodeEqualTo(String value) {
            addCriterion("TYPECODE =", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotEqualTo(String value) {
            addCriterion("TYPECODE <>", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThan(String value) {
            addCriterion("TYPECODE >", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPECODE >=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThan(String value) {
            addCriterion("TYPECODE <", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThanOrEqualTo(String value) {
            addCriterion("TYPECODE <=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLike(String value) {
            addCriterion("TYPECODE like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotLike(String value) {
            addCriterion("TYPECODE not like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeIn(List<String> values) {
            addCriterion("TYPECODE in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotIn(List<String> values) {
            addCriterion("TYPECODE not in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeBetween(String value1, String value2) {
            addCriterion("TYPECODE between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotBetween(String value1, String value2) {
            addCriterion("TYPECODE not between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("INFO is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("INFO is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("INFO =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("INFO <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("INFO >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("INFO >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("INFO <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("INFO <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("INFO like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("INFO not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("INFO in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("INFO not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("INFO between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("INFO not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("UPDATETIME like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("UPDATETIME not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andDictsortIsNull() {
            addCriterion("DICTSORT is null");
            return (Criteria) this;
        }

        public Criteria andDictsortIsNotNull() {
            addCriterion("DICTSORT is not null");
            return (Criteria) this;
        }

        public Criteria andDictsortEqualTo(BigDecimal value) {
            addCriterion("DICTSORT =", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortNotEqualTo(BigDecimal value) {
            addCriterion("DICTSORT <>", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortGreaterThan(BigDecimal value) {
            addCriterion("DICTSORT >", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DICTSORT >=", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortLessThan(BigDecimal value) {
            addCriterion("DICTSORT <", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DICTSORT <=", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortIn(List<BigDecimal> values) {
            addCriterion("DICTSORT in", values, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortNotIn(List<BigDecimal> values) {
            addCriterion("DICTSORT not in", values, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DICTSORT between", value1, value2, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DICTSORT not between", value1, value2, "dictsort");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNull() {
            addCriterion("ISENABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNotNull() {
            addCriterion("ISENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsenableEqualTo(String value) {
            addCriterion("ISENABLE =", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotEqualTo(String value) {
            addCriterion("ISENABLE <>", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThan(String value) {
            addCriterion("ISENABLE >", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThanOrEqualTo(String value) {
            addCriterion("ISENABLE >=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThan(String value) {
            addCriterion("ISENABLE <", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThanOrEqualTo(String value) {
            addCriterion("ISENABLE <=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLike(String value) {
            addCriterion("ISENABLE like", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotLike(String value) {
            addCriterion("ISENABLE not like", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableIn(List<String> values) {
            addCriterion("ISENABLE in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotIn(List<String> values) {
            addCriterion("ISENABLE not in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableBetween(String value1, String value2) {
            addCriterion("ISENABLE between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotBetween(String value1, String value2) {
            addCriterion("ISENABLE not between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andValuetypeIsNull() {
            addCriterion("VALUETYPE is null");
            return (Criteria) this;
        }

        public Criteria andValuetypeIsNotNull() {
            addCriterion("VALUETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andValuetypeEqualTo(String value) {
            addCriterion("VALUETYPE =", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeNotEqualTo(String value) {
            addCriterion("VALUETYPE <>", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeGreaterThan(String value) {
            addCriterion("VALUETYPE >", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeGreaterThanOrEqualTo(String value) {
            addCriterion("VALUETYPE >=", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeLessThan(String value) {
            addCriterion("VALUETYPE <", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeLessThanOrEqualTo(String value) {
            addCriterion("VALUETYPE <=", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeLike(String value) {
            addCriterion("VALUETYPE like", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeNotLike(String value) {
            addCriterion("VALUETYPE not like", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeIn(List<String> values) {
            addCriterion("VALUETYPE in", values, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeNotIn(List<String> values) {
            addCriterion("VALUETYPE not in", values, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeBetween(String value1, String value2) {
            addCriterion("VALUETYPE between", value1, value2, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeNotBetween(String value1, String value2) {
            addCriterion("VALUETYPE not between", value1, value2, "valuetype");
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