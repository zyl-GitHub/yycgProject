package yycg.base.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DicttypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DicttypeExample() {
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

        public Criteria andTypenameIsNull() {
            addCriterion("TYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("TYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("TYPENAME =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("TYPENAME <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("TYPENAME >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("TYPENAME >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("TYPENAME <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("TYPENAME <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("TYPENAME like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("TYPENAME not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("TYPENAME in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("TYPENAME not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("TYPENAME between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("TYPENAME not between", value1, value2, "typename");
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

        public Criteria andTypesortIsNull() {
            addCriterion("TYPESORT is null");
            return (Criteria) this;
        }

        public Criteria andTypesortIsNotNull() {
            addCriterion("TYPESORT is not null");
            return (Criteria) this;
        }

        public Criteria andTypesortEqualTo(BigDecimal value) {
            addCriterion("TYPESORT =", value, "typesort");
            return (Criteria) this;
        }

        public Criteria andTypesortNotEqualTo(BigDecimal value) {
            addCriterion("TYPESORT <>", value, "typesort");
            return (Criteria) this;
        }

        public Criteria andTypesortGreaterThan(BigDecimal value) {
            addCriterion("TYPESORT >", value, "typesort");
            return (Criteria) this;
        }

        public Criteria andTypesortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPESORT >=", value, "typesort");
            return (Criteria) this;
        }

        public Criteria andTypesortLessThan(BigDecimal value) {
            addCriterion("TYPESORT <", value, "typesort");
            return (Criteria) this;
        }

        public Criteria andTypesortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPESORT <=", value, "typesort");
            return (Criteria) this;
        }

        public Criteria andTypesortIn(List<BigDecimal> values) {
            addCriterion("TYPESORT in", values, "typesort");
            return (Criteria) this;
        }

        public Criteria andTypesortNotIn(List<BigDecimal> values) {
            addCriterion("TYPESORT not in", values, "typesort");
            return (Criteria) this;
        }

        public Criteria andTypesortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPESORT between", value1, value2, "typesort");
            return (Criteria) this;
        }

        public Criteria andTypesortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPESORT not between", value1, value2, "typesort");
            return (Criteria) this;
        }

        public Criteria andCodelengthIsNull() {
            addCriterion("CODELENGTH is null");
            return (Criteria) this;
        }

        public Criteria andCodelengthIsNotNull() {
            addCriterion("CODELENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andCodelengthEqualTo(String value) {
            addCriterion("CODELENGTH =", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthNotEqualTo(String value) {
            addCriterion("CODELENGTH <>", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthGreaterThan(String value) {
            addCriterion("CODELENGTH >", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthGreaterThanOrEqualTo(String value) {
            addCriterion("CODELENGTH >=", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthLessThan(String value) {
            addCriterion("CODELENGTH <", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthLessThanOrEqualTo(String value) {
            addCriterion("CODELENGTH <=", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthLike(String value) {
            addCriterion("CODELENGTH like", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthNotLike(String value) {
            addCriterion("CODELENGTH not like", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthIn(List<String> values) {
            addCriterion("CODELENGTH in", values, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthNotIn(List<String> values) {
            addCriterion("CODELENGTH not in", values, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthBetween(String value1, String value2) {
            addCriterion("CODELENGTH between", value1, value2, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthNotBetween(String value1, String value2) {
            addCriterion("CODELENGTH not between", value1, value2, "codelength");
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