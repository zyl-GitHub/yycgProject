package yycg.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class UseryyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UseryyExample() {
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

        public Criteria andMcIsNull() {
            addCriterion("MC is null");
            return (Criteria) this;
        }

        public Criteria andMcIsNotNull() {
            addCriterion("MC is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(String value) {
            addCriterion("MC =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(String value) {
            addCriterion("MC <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(String value) {
            addCriterion("MC >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(String value) {
            addCriterion("MC >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(String value) {
            addCriterion("MC <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(String value) {
            addCriterion("MC <=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLike(String value) {
            addCriterion("MC like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotLike(String value) {
            addCriterion("MC not like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcIn(List<String> values) {
            addCriterion("MC in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<String> values) {
            addCriterion("MC not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(String value1, String value2) {
            addCriterion("MC between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(String value1, String value2) {
            addCriterion("MC not between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andDzIsNull() {
            addCriterion("DZ is null");
            return (Criteria) this;
        }

        public Criteria andDzIsNotNull() {
            addCriterion("DZ is not null");
            return (Criteria) this;
        }

        public Criteria andDzEqualTo(String value) {
            addCriterion("DZ =", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotEqualTo(String value) {
            addCriterion("DZ <>", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThan(String value) {
            addCriterion("DZ >", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThanOrEqualTo(String value) {
            addCriterion("DZ >=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThan(String value) {
            addCriterion("DZ <", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThanOrEqualTo(String value) {
            addCriterion("DZ <=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLike(String value) {
            addCriterion("DZ like", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotLike(String value) {
            addCriterion("DZ not like", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzIn(List<String> values) {
            addCriterion("DZ in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotIn(List<String> values) {
            addCriterion("DZ not in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzBetween(String value1, String value2) {
            addCriterion("DZ between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotBetween(String value1, String value2) {
            addCriterion("DZ not between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNull() {
            addCriterion("YZBM is null");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNotNull() {
            addCriterion("YZBM is not null");
            return (Criteria) this;
        }

        public Criteria andYzbmEqualTo(String value) {
            addCriterion("YZBM =", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotEqualTo(String value) {
            addCriterion("YZBM <>", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThan(String value) {
            addCriterion("YZBM >", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThanOrEqualTo(String value) {
            addCriterion("YZBM >=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThan(String value) {
            addCriterion("YZBM <", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThanOrEqualTo(String value) {
            addCriterion("YZBM <=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLike(String value) {
            addCriterion("YZBM like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotLike(String value) {
            addCriterion("YZBM not like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmIn(List<String> values) {
            addCriterion("YZBM in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotIn(List<String> values) {
            addCriterion("YZBM not in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmBetween(String value1, String value2) {
            addCriterion("YZBM between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotBetween(String value1, String value2) {
            addCriterion("YZBM not between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andDqIsNull() {
            addCriterion("DQ is null");
            return (Criteria) this;
        }

        public Criteria andDqIsNotNull() {
            addCriterion("DQ is not null");
            return (Criteria) this;
        }

        public Criteria andDqEqualTo(String value) {
            addCriterion("DQ =", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqNotEqualTo(String value) {
            addCriterion("DQ <>", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqGreaterThan(String value) {
            addCriterion("DQ >", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqGreaterThanOrEqualTo(String value) {
            addCriterion("DQ >=", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqLessThan(String value) {
            addCriterion("DQ <", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqLessThanOrEqualTo(String value) {
            addCriterion("DQ <=", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqLike(String value) {
            addCriterion("DQ like", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqNotLike(String value) {
            addCriterion("DQ not like", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqIn(List<String> values) {
            addCriterion("DQ in", values, "dq");
            return (Criteria) this;
        }

        public Criteria andDqNotIn(List<String> values) {
            addCriterion("DQ not in", values, "dq");
            return (Criteria) this;
        }

        public Criteria andDqBetween(String value1, String value2) {
            addCriterion("DQ between", value1, value2, "dq");
            return (Criteria) this;
        }

        public Criteria andDqNotBetween(String value1, String value2) {
            addCriterion("DQ not between", value1, value2, "dq");
            return (Criteria) this;
        }

        public Criteria andJbIsNull() {
            addCriterion("JB is null");
            return (Criteria) this;
        }

        public Criteria andJbIsNotNull() {
            addCriterion("JB is not null");
            return (Criteria) this;
        }

        public Criteria andJbEqualTo(String value) {
            addCriterion("JB =", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotEqualTo(String value) {
            addCriterion("JB <>", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbGreaterThan(String value) {
            addCriterion("JB >", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbGreaterThanOrEqualTo(String value) {
            addCriterion("JB >=", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbLessThan(String value) {
            addCriterion("JB <", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbLessThanOrEqualTo(String value) {
            addCriterion("JB <=", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbLike(String value) {
            addCriterion("JB like", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotLike(String value) {
            addCriterion("JB not like", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbIn(List<String> values) {
            addCriterion("JB in", values, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotIn(List<String> values) {
            addCriterion("JB not in", values, "jb");
            return (Criteria) this;
        }

        public Criteria andJbBetween(String value1, String value2) {
            addCriterion("JB between", value1, value2, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotBetween(String value1, String value2) {
            addCriterion("JB not between", value1, value2, "jb");
            return (Criteria) this;
        }

        public Criteria andCwsIsNull() {
            addCriterion("CWS is null");
            return (Criteria) this;
        }

        public Criteria andCwsIsNotNull() {
            addCriterion("CWS is not null");
            return (Criteria) this;
        }

        public Criteria andCwsEqualTo(String value) {
            addCriterion("CWS =", value, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsNotEqualTo(String value) {
            addCriterion("CWS <>", value, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsGreaterThan(String value) {
            addCriterion("CWS >", value, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsGreaterThanOrEqualTo(String value) {
            addCriterion("CWS >=", value, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsLessThan(String value) {
            addCriterion("CWS <", value, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsLessThanOrEqualTo(String value) {
            addCriterion("CWS <=", value, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsLike(String value) {
            addCriterion("CWS like", value, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsNotLike(String value) {
            addCriterion("CWS not like", value, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsIn(List<String> values) {
            addCriterion("CWS in", values, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsNotIn(List<String> values) {
            addCriterion("CWS not in", values, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsBetween(String value1, String value2) {
            addCriterion("CWS between", value1, value2, "cws");
            return (Criteria) this;
        }

        public Criteria andCwsNotBetween(String value1, String value2) {
            addCriterion("CWS not between", value1, value2, "cws");
            return (Criteria) this;
        }

        public Criteria andFyljgIsNull() {
            addCriterion("FYLJG is null");
            return (Criteria) this;
        }

        public Criteria andFyljgIsNotNull() {
            addCriterion("FYLJG is not null");
            return (Criteria) this;
        }

        public Criteria andFyljgEqualTo(String value) {
            addCriterion("FYLJG =", value, "fyljg");
            return (Criteria) this;
        }

        public Criteria andFyljgNotEqualTo(String value) {
            addCriterion("FYLJG <>", value, "fyljg");
            return (Criteria) this;
        }

        public Criteria andFyljgGreaterThan(String value) {
            addCriterion("FYLJG >", value, "fyljg");
            return (Criteria) this;
        }

        public Criteria andFyljgGreaterThanOrEqualTo(String value) {
            addCriterion("FYLJG >=", value, "fyljg");
            return (Criteria) this;
        }

        public Criteria andFyljgLessThan(String value) {
            addCriterion("FYLJG <", value, "fyljg");
            return (Criteria) this;
        }

        public Criteria andFyljgLessThanOrEqualTo(String value) {
            addCriterion("FYLJG <=", value, "fyljg");
            return (Criteria) this;
        }

        public Criteria andFyljgLike(String value) {
            addCriterion("FYLJG like", value, "fyljg");
            return (Criteria) this;
        }

        public Criteria andFyljgNotLike(String value) {
            addCriterion("FYLJG not like", value, "fyljg");
            return (Criteria) this;
        }

        public Criteria andFyljgIn(List<String> values) {
            addCriterion("FYLJG in", values, "fyljg");
            return (Criteria) this;
        }

        public Criteria andFyljgNotIn(List<String> values) {
            addCriterion("FYLJG not in", values, "fyljg");
            return (Criteria) this;
        }

        public Criteria andFyljgBetween(String value1, String value2) {
            addCriterion("FYLJG between", value1, value2, "fyljg");
            return (Criteria) this;
        }

        public Criteria andFyljgNotBetween(String value1, String value2) {
            addCriterion("FYLJG not between", value1, value2, "fyljg");
            return (Criteria) this;
        }

        public Criteria andDhIsNull() {
            addCriterion("DH is null");
            return (Criteria) this;
        }

        public Criteria andDhIsNotNull() {
            addCriterion("DH is not null");
            return (Criteria) this;
        }

        public Criteria andDhEqualTo(String value) {
            addCriterion("DH =", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotEqualTo(String value) {
            addCriterion("DH <>", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThan(String value) {
            addCriterion("DH >", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThanOrEqualTo(String value) {
            addCriterion("DH >=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThan(String value) {
            addCriterion("DH <", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThanOrEqualTo(String value) {
            addCriterion("DH <=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLike(String value) {
            addCriterion("DH like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotLike(String value) {
            addCriterion("DH not like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhIn(List<String> values) {
            addCriterion("DH in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotIn(List<String> values) {
            addCriterion("DH not in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhBetween(String value1, String value2) {
            addCriterion("DH between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotBetween(String value1, String value2) {
            addCriterion("DH not between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andYjkdhIsNull() {
            addCriterion("YJKDH is null");
            return (Criteria) this;
        }

        public Criteria andYjkdhIsNotNull() {
            addCriterion("YJKDH is not null");
            return (Criteria) this;
        }

        public Criteria andYjkdhEqualTo(String value) {
            addCriterion("YJKDH =", value, "yjkdh");
            return (Criteria) this;
        }

        public Criteria andYjkdhNotEqualTo(String value) {
            addCriterion("YJKDH <>", value, "yjkdh");
            return (Criteria) this;
        }

        public Criteria andYjkdhGreaterThan(String value) {
            addCriterion("YJKDH >", value, "yjkdh");
            return (Criteria) this;
        }

        public Criteria andYjkdhGreaterThanOrEqualTo(String value) {
            addCriterion("YJKDH >=", value, "yjkdh");
            return (Criteria) this;
        }

        public Criteria andYjkdhLessThan(String value) {
            addCriterion("YJKDH <", value, "yjkdh");
            return (Criteria) this;
        }

        public Criteria andYjkdhLessThanOrEqualTo(String value) {
            addCriterion("YJKDH <=", value, "yjkdh");
            return (Criteria) this;
        }

        public Criteria andYjkdhLike(String value) {
            addCriterion("YJKDH like", value, "yjkdh");
            return (Criteria) this;
        }

        public Criteria andYjkdhNotLike(String value) {
            addCriterion("YJKDH not like", value, "yjkdh");
            return (Criteria) this;
        }

        public Criteria andYjkdhIn(List<String> values) {
            addCriterion("YJKDH in", values, "yjkdh");
            return (Criteria) this;
        }

        public Criteria andYjkdhNotIn(List<String> values) {
            addCriterion("YJKDH not in", values, "yjkdh");
            return (Criteria) this;
        }

        public Criteria andYjkdhBetween(String value1, String value2) {
            addCriterion("YJKDH between", value1, value2, "yjkdh");
            return (Criteria) this;
        }

        public Criteria andYjkdhNotBetween(String value1, String value2) {
            addCriterion("YJKDH not between", value1, value2, "yjkdh");
            return (Criteria) this;
        }

        public Criteria andLbIsNull() {
            addCriterion("LB is null");
            return (Criteria) this;
        }

        public Criteria andLbIsNotNull() {
            addCriterion("LB is not null");
            return (Criteria) this;
        }

        public Criteria andLbEqualTo(String value) {
            addCriterion("LB =", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotEqualTo(String value) {
            addCriterion("LB <>", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbGreaterThan(String value) {
            addCriterion("LB >", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbGreaterThanOrEqualTo(String value) {
            addCriterion("LB >=", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLessThan(String value) {
            addCriterion("LB <", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLessThanOrEqualTo(String value) {
            addCriterion("LB <=", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLike(String value) {
            addCriterion("LB like", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotLike(String value) {
            addCriterion("LB not like", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbIn(List<String> values) {
            addCriterion("LB in", values, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotIn(List<String> values) {
            addCriterion("LB not in", values, "lb");
            return (Criteria) this;
        }

        public Criteria andLbBetween(String value1, String value2) {
            addCriterion("LB between", value1, value2, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotBetween(String value1, String value2) {
            addCriterion("LB not between", value1, value2, "lb");
            return (Criteria) this;
        }

        public Criteria andYpsrIsNull() {
            addCriterion("YPSR is null");
            return (Criteria) this;
        }

        public Criteria andYpsrIsNotNull() {
            addCriterion("YPSR is not null");
            return (Criteria) this;
        }

        public Criteria andYpsrEqualTo(String value) {
            addCriterion("YPSR =", value, "ypsr");
            return (Criteria) this;
        }

        public Criteria andYpsrNotEqualTo(String value) {
            addCriterion("YPSR <>", value, "ypsr");
            return (Criteria) this;
        }

        public Criteria andYpsrGreaterThan(String value) {
            addCriterion("YPSR >", value, "ypsr");
            return (Criteria) this;
        }

        public Criteria andYpsrGreaterThanOrEqualTo(String value) {
            addCriterion("YPSR >=", value, "ypsr");
            return (Criteria) this;
        }

        public Criteria andYpsrLessThan(String value) {
            addCriterion("YPSR <", value, "ypsr");
            return (Criteria) this;
        }

        public Criteria andYpsrLessThanOrEqualTo(String value) {
            addCriterion("YPSR <=", value, "ypsr");
            return (Criteria) this;
        }

        public Criteria andYpsrLike(String value) {
            addCriterion("YPSR like", value, "ypsr");
            return (Criteria) this;
        }

        public Criteria andYpsrNotLike(String value) {
            addCriterion("YPSR not like", value, "ypsr");
            return (Criteria) this;
        }

        public Criteria andYpsrIn(List<String> values) {
            addCriterion("YPSR in", values, "ypsr");
            return (Criteria) this;
        }

        public Criteria andYpsrNotIn(List<String> values) {
            addCriterion("YPSR not in", values, "ypsr");
            return (Criteria) this;
        }

        public Criteria andYpsrBetween(String value1, String value2) {
            addCriterion("YPSR between", value1, value2, "ypsr");
            return (Criteria) this;
        }

        public Criteria andYpsrNotBetween(String value1, String value2) {
            addCriterion("YPSR not between", value1, value2, "ypsr");
            return (Criteria) this;
        }

        public Criteria andYwsrIsNull() {
            addCriterion("YWSR is null");
            return (Criteria) this;
        }

        public Criteria andYwsrIsNotNull() {
            addCriterion("YWSR is not null");
            return (Criteria) this;
        }

        public Criteria andYwsrEqualTo(String value) {
            addCriterion("YWSR =", value, "ywsr");
            return (Criteria) this;
        }

        public Criteria andYwsrNotEqualTo(String value) {
            addCriterion("YWSR <>", value, "ywsr");
            return (Criteria) this;
        }

        public Criteria andYwsrGreaterThan(String value) {
            addCriterion("YWSR >", value, "ywsr");
            return (Criteria) this;
        }

        public Criteria andYwsrGreaterThanOrEqualTo(String value) {
            addCriterion("YWSR >=", value, "ywsr");
            return (Criteria) this;
        }

        public Criteria andYwsrLessThan(String value) {
            addCriterion("YWSR <", value, "ywsr");
            return (Criteria) this;
        }

        public Criteria andYwsrLessThanOrEqualTo(String value) {
            addCriterion("YWSR <=", value, "ywsr");
            return (Criteria) this;
        }

        public Criteria andYwsrLike(String value) {
            addCriterion("YWSR like", value, "ywsr");
            return (Criteria) this;
        }

        public Criteria andYwsrNotLike(String value) {
            addCriterion("YWSR not like", value, "ywsr");
            return (Criteria) this;
        }

        public Criteria andYwsrIn(List<String> values) {
            addCriterion("YWSR in", values, "ywsr");
            return (Criteria) this;
        }

        public Criteria andYwsrNotIn(List<String> values) {
            addCriterion("YWSR not in", values, "ywsr");
            return (Criteria) this;
        }

        public Criteria andYwsrBetween(String value1, String value2) {
            addCriterion("YWSR between", value1, value2, "ywsr");
            return (Criteria) this;
        }

        public Criteria andYwsrNotBetween(String value1, String value2) {
            addCriterion("YWSR not between", value1, value2, "ywsr");
            return (Criteria) this;
        }

        public Criteria andCzIsNull() {
            addCriterion("CZ is null");
            return (Criteria) this;
        }

        public Criteria andCzIsNotNull() {
            addCriterion("CZ is not null");
            return (Criteria) this;
        }

        public Criteria andCzEqualTo(String value) {
            addCriterion("CZ =", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotEqualTo(String value) {
            addCriterion("CZ <>", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThan(String value) {
            addCriterion("CZ >", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThanOrEqualTo(String value) {
            addCriterion("CZ >=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThan(String value) {
            addCriterion("CZ <", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThanOrEqualTo(String value) {
            addCriterion("CZ <=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLike(String value) {
            addCriterion("CZ like", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotLike(String value) {
            addCriterion("CZ not like", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzIn(List<String> values) {
            addCriterion("CZ in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotIn(List<String> values) {
            addCriterion("CZ not in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzBetween(String value1, String value2) {
            addCriterion("CZ between", value1, value2, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotBetween(String value1, String value2) {
            addCriterion("CZ not between", value1, value2, "cz");
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