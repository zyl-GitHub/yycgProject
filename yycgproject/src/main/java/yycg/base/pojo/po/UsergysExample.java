package yycg.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class UsergysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsergysExample() {
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

        public Criteria andXkzIsNull() {
            addCriterion("XKZ is null");
            return (Criteria) this;
        }

        public Criteria andXkzIsNotNull() {
            addCriterion("XKZ is not null");
            return (Criteria) this;
        }

        public Criteria andXkzEqualTo(String value) {
            addCriterion("XKZ =", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzNotEqualTo(String value) {
            addCriterion("XKZ <>", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzGreaterThan(String value) {
            addCriterion("XKZ >", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzGreaterThanOrEqualTo(String value) {
            addCriterion("XKZ >=", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzLessThan(String value) {
            addCriterion("XKZ <", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzLessThanOrEqualTo(String value) {
            addCriterion("XKZ <=", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzLike(String value) {
            addCriterion("XKZ like", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzNotLike(String value) {
            addCriterion("XKZ not like", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzIn(List<String> values) {
            addCriterion("XKZ in", values, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzNotIn(List<String> values) {
            addCriterion("XKZ not in", values, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzBetween(String value1, String value2) {
            addCriterion("XKZ between", value1, value2, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzNotBetween(String value1, String value2) {
            addCriterion("XKZ not between", value1, value2, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzyxqIsNull() {
            addCriterion("XKZYXQ is null");
            return (Criteria) this;
        }

        public Criteria andXkzyxqIsNotNull() {
            addCriterion("XKZYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andXkzyxqEqualTo(String value) {
            addCriterion("XKZYXQ =", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqNotEqualTo(String value) {
            addCriterion("XKZYXQ <>", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqGreaterThan(String value) {
            addCriterion("XKZYXQ >", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqGreaterThanOrEqualTo(String value) {
            addCriterion("XKZYXQ >=", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqLessThan(String value) {
            addCriterion("XKZYXQ <", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqLessThanOrEqualTo(String value) {
            addCriterion("XKZYXQ <=", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqLike(String value) {
            addCriterion("XKZYXQ like", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqNotLike(String value) {
            addCriterion("XKZYXQ not like", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqIn(List<String> values) {
            addCriterion("XKZYXQ in", values, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqNotIn(List<String> values) {
            addCriterion("XKZYXQ not in", values, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqBetween(String value1, String value2) {
            addCriterion("XKZYXQ between", value1, value2, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqNotBetween(String value1, String value2) {
            addCriterion("XKZYXQ not between", value1, value2, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andLxrIsNull() {
            addCriterion("LXR is null");
            return (Criteria) this;
        }

        public Criteria andLxrIsNotNull() {
            addCriterion("LXR is not null");
            return (Criteria) this;
        }

        public Criteria andLxrEqualTo(String value) {
            addCriterion("LXR =", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotEqualTo(String value) {
            addCriterion("LXR <>", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrGreaterThan(String value) {
            addCriterion("LXR >", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrGreaterThanOrEqualTo(String value) {
            addCriterion("LXR >=", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLessThan(String value) {
            addCriterion("LXR <", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLessThanOrEqualTo(String value) {
            addCriterion("LXR <=", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLike(String value) {
            addCriterion("LXR like", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotLike(String value) {
            addCriterion("LXR not like", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrIn(List<String> values) {
            addCriterion("LXR in", values, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotIn(List<String> values) {
            addCriterion("LXR not in", values, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrBetween(String value1, String value2) {
            addCriterion("LXR between", value1, value2, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotBetween(String value1, String value2) {
            addCriterion("LXR not between", value1, value2, "lxr");
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

        public Criteria andJyfwIsNull() {
            addCriterion("JYFW is null");
            return (Criteria) this;
        }

        public Criteria andJyfwIsNotNull() {
            addCriterion("JYFW is not null");
            return (Criteria) this;
        }

        public Criteria andJyfwEqualTo(String value) {
            addCriterion("JYFW =", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotEqualTo(String value) {
            addCriterion("JYFW <>", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwGreaterThan(String value) {
            addCriterion("JYFW >", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwGreaterThanOrEqualTo(String value) {
            addCriterion("JYFW >=", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLessThan(String value) {
            addCriterion("JYFW <", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLessThanOrEqualTo(String value) {
            addCriterion("JYFW <=", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLike(String value) {
            addCriterion("JYFW like", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotLike(String value) {
            addCriterion("JYFW not like", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwIn(List<String> values) {
            addCriterion("JYFW in", values, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotIn(List<String> values) {
            addCriterion("JYFW not in", values, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwBetween(String value1, String value2) {
            addCriterion("JYFW between", value1, value2, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotBetween(String value1, String value2) {
            addCriterion("JYFW not between", value1, value2, "jyfw");
            return (Criteria) this;
        }

        public Criteria andZcdzIsNull() {
            addCriterion("ZCDZ is null");
            return (Criteria) this;
        }

        public Criteria andZcdzIsNotNull() {
            addCriterion("ZCDZ is not null");
            return (Criteria) this;
        }

        public Criteria andZcdzEqualTo(String value) {
            addCriterion("ZCDZ =", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzNotEqualTo(String value) {
            addCriterion("ZCDZ <>", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzGreaterThan(String value) {
            addCriterion("ZCDZ >", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzGreaterThanOrEqualTo(String value) {
            addCriterion("ZCDZ >=", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzLessThan(String value) {
            addCriterion("ZCDZ <", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzLessThanOrEqualTo(String value) {
            addCriterion("ZCDZ <=", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzLike(String value) {
            addCriterion("ZCDZ like", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzNotLike(String value) {
            addCriterion("ZCDZ not like", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzIn(List<String> values) {
            addCriterion("ZCDZ in", values, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzNotIn(List<String> values) {
            addCriterion("ZCDZ not in", values, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzBetween(String value1, String value2) {
            addCriterion("ZCDZ between", value1, value2, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzNotBetween(String value1, String value2) {
            addCriterion("ZCDZ not between", value1, value2, "zcdz");
            return (Criteria) this;
        }

        public Criteria andLxdzIsNull() {
            addCriterion("LXDZ is null");
            return (Criteria) this;
        }

        public Criteria andLxdzIsNotNull() {
            addCriterion("LXDZ is not null");
            return (Criteria) this;
        }

        public Criteria andLxdzEqualTo(String value) {
            addCriterion("LXDZ =", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotEqualTo(String value) {
            addCriterion("LXDZ <>", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzGreaterThan(String value) {
            addCriterion("LXDZ >", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzGreaterThanOrEqualTo(String value) {
            addCriterion("LXDZ >=", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLessThan(String value) {
            addCriterion("LXDZ <", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLessThanOrEqualTo(String value) {
            addCriterion("LXDZ <=", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLike(String value) {
            addCriterion("LXDZ like", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotLike(String value) {
            addCriterion("LXDZ not like", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzIn(List<String> values) {
            addCriterion("LXDZ in", values, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotIn(List<String> values) {
            addCriterion("LXDZ not in", values, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzBetween(String value1, String value2) {
            addCriterion("LXDZ between", value1, value2, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotBetween(String value1, String value2) {
            addCriterion("LXDZ not between", value1, value2, "lxdz");
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

        public Criteria andZzcIsNull() {
            addCriterion("ZZC is null");
            return (Criteria) this;
        }

        public Criteria andZzcIsNotNull() {
            addCriterion("ZZC is not null");
            return (Criteria) this;
        }

        public Criteria andZzcEqualTo(String value) {
            addCriterion("ZZC =", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcNotEqualTo(String value) {
            addCriterion("ZZC <>", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcGreaterThan(String value) {
            addCriterion("ZZC >", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcGreaterThanOrEqualTo(String value) {
            addCriterion("ZZC >=", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcLessThan(String value) {
            addCriterion("ZZC <", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcLessThanOrEqualTo(String value) {
            addCriterion("ZZC <=", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcLike(String value) {
            addCriterion("ZZC like", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcNotLike(String value) {
            addCriterion("ZZC not like", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcIn(List<String> values) {
            addCriterion("ZZC in", values, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcNotIn(List<String> values) {
            addCriterion("ZZC not in", values, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcBetween(String value1, String value2) {
            addCriterion("ZZC between", value1, value2, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcNotBetween(String value1, String value2) {
            addCriterion("ZZC not between", value1, value2, "zzc");
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

        public Criteria andFrmcIsNull() {
            addCriterion("FRMC is null");
            return (Criteria) this;
        }

        public Criteria andFrmcIsNotNull() {
            addCriterion("FRMC is not null");
            return (Criteria) this;
        }

        public Criteria andFrmcEqualTo(String value) {
            addCriterion("FRMC =", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcNotEqualTo(String value) {
            addCriterion("FRMC <>", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcGreaterThan(String value) {
            addCriterion("FRMC >", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcGreaterThanOrEqualTo(String value) {
            addCriterion("FRMC >=", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcLessThan(String value) {
            addCriterion("FRMC <", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcLessThanOrEqualTo(String value) {
            addCriterion("FRMC <=", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcLike(String value) {
            addCriterion("FRMC like", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcNotLike(String value) {
            addCriterion("FRMC not like", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcIn(List<String> values) {
            addCriterion("FRMC in", values, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcNotIn(List<String> values) {
            addCriterion("FRMC not in", values, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcBetween(String value1, String value2) {
            addCriterion("FRMC between", value1, value2, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcNotBetween(String value1, String value2) {
            addCriterion("FRMC not between", value1, value2, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrsfzIsNull() {
            addCriterion("FRSFZ is null");
            return (Criteria) this;
        }

        public Criteria andFrsfzIsNotNull() {
            addCriterion("FRSFZ is not null");
            return (Criteria) this;
        }

        public Criteria andFrsfzEqualTo(String value) {
            addCriterion("FRSFZ =", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzNotEqualTo(String value) {
            addCriterion("FRSFZ <>", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzGreaterThan(String value) {
            addCriterion("FRSFZ >", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzGreaterThanOrEqualTo(String value) {
            addCriterion("FRSFZ >=", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzLessThan(String value) {
            addCriterion("FRSFZ <", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzLessThanOrEqualTo(String value) {
            addCriterion("FRSFZ <=", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzLike(String value) {
            addCriterion("FRSFZ like", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzNotLike(String value) {
            addCriterion("FRSFZ not like", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzIn(List<String> values) {
            addCriterion("FRSFZ in", values, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzNotIn(List<String> values) {
            addCriterion("FRSFZ not in", values, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzBetween(String value1, String value2) {
            addCriterion("FRSFZ between", value1, value2, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzNotBetween(String value1, String value2) {
            addCriterion("FRSFZ not between", value1, value2, "frsfz");
            return (Criteria) this;
        }

        public Criteria andZczjIsNull() {
            addCriterion("ZCZJ is null");
            return (Criteria) this;
        }

        public Criteria andZczjIsNotNull() {
            addCriterion("ZCZJ is not null");
            return (Criteria) this;
        }

        public Criteria andZczjEqualTo(String value) {
            addCriterion("ZCZJ =", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotEqualTo(String value) {
            addCriterion("ZCZJ <>", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjGreaterThan(String value) {
            addCriterion("ZCZJ >", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjGreaterThanOrEqualTo(String value) {
            addCriterion("ZCZJ >=", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjLessThan(String value) {
            addCriterion("ZCZJ <", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjLessThanOrEqualTo(String value) {
            addCriterion("ZCZJ <=", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjLike(String value) {
            addCriterion("ZCZJ like", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotLike(String value) {
            addCriterion("ZCZJ not like", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjIn(List<String> values) {
            addCriterion("ZCZJ in", values, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotIn(List<String> values) {
            addCriterion("ZCZJ not in", values, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjBetween(String value1, String value2) {
            addCriterion("ZCZJ between", value1, value2, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotBetween(String value1, String value2) {
            addCriterion("ZCZJ not between", value1, value2, "zczj");
            return (Criteria) this;
        }

        public Criteria andXseIsNull() {
            addCriterion("XSE is null");
            return (Criteria) this;
        }

        public Criteria andXseIsNotNull() {
            addCriterion("XSE is not null");
            return (Criteria) this;
        }

        public Criteria andXseEqualTo(String value) {
            addCriterion("XSE =", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseNotEqualTo(String value) {
            addCriterion("XSE <>", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseGreaterThan(String value) {
            addCriterion("XSE >", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseGreaterThanOrEqualTo(String value) {
            addCriterion("XSE >=", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseLessThan(String value) {
            addCriterion("XSE <", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseLessThanOrEqualTo(String value) {
            addCriterion("XSE <=", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseLike(String value) {
            addCriterion("XSE like", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseNotLike(String value) {
            addCriterion("XSE not like", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseIn(List<String> values) {
            addCriterion("XSE in", values, "xse");
            return (Criteria) this;
        }

        public Criteria andXseNotIn(List<String> values) {
            addCriterion("XSE not in", values, "xse");
            return (Criteria) this;
        }

        public Criteria andXseBetween(String value1, String value2) {
            addCriterion("XSE between", value1, value2, "xse");
            return (Criteria) this;
        }

        public Criteria andXseNotBetween(String value1, String value2) {
            addCriterion("XSE not between", value1, value2, "xse");
            return (Criteria) this;
        }

        public Criteria andDzyxIsNull() {
            addCriterion("DZYX is null");
            return (Criteria) this;
        }

        public Criteria andDzyxIsNotNull() {
            addCriterion("DZYX is not null");
            return (Criteria) this;
        }

        public Criteria andDzyxEqualTo(String value) {
            addCriterion("DZYX =", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotEqualTo(String value) {
            addCriterion("DZYX <>", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxGreaterThan(String value) {
            addCriterion("DZYX >", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxGreaterThanOrEqualTo(String value) {
            addCriterion("DZYX >=", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLessThan(String value) {
            addCriterion("DZYX <", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLessThanOrEqualTo(String value) {
            addCriterion("DZYX <=", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLike(String value) {
            addCriterion("DZYX like", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotLike(String value) {
            addCriterion("DZYX not like", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxIn(List<String> values) {
            addCriterion("DZYX in", values, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotIn(List<String> values) {
            addCriterion("DZYX not in", values, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxBetween(String value1, String value2) {
            addCriterion("DZYX between", value1, value2, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotBetween(String value1, String value2) {
            addCriterion("DZYX not between", value1, value2, "dzyx");
            return (Criteria) this;
        }

        public Criteria andWzIsNull() {
            addCriterion("WZ is null");
            return (Criteria) this;
        }

        public Criteria andWzIsNotNull() {
            addCriterion("WZ is not null");
            return (Criteria) this;
        }

        public Criteria andWzEqualTo(String value) {
            addCriterion("WZ =", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotEqualTo(String value) {
            addCriterion("WZ <>", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzGreaterThan(String value) {
            addCriterion("WZ >", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzGreaterThanOrEqualTo(String value) {
            addCriterion("WZ >=", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzLessThan(String value) {
            addCriterion("WZ <", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzLessThanOrEqualTo(String value) {
            addCriterion("WZ <=", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzLike(String value) {
            addCriterion("WZ like", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotLike(String value) {
            addCriterion("WZ not like", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzIn(List<String> values) {
            addCriterion("WZ in", values, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotIn(List<String> values) {
            addCriterion("WZ not in", values, "wz");
            return (Criteria) this;
        }

        public Criteria andWzBetween(String value1, String value2) {
            addCriterion("WZ between", value1, value2, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotBetween(String value1, String value2) {
            addCriterion("WZ not between", value1, value2, "wz");
            return (Criteria) this;
        }

        public Criteria andDmzhIsNull() {
            addCriterion("DMZH is null");
            return (Criteria) this;
        }

        public Criteria andDmzhIsNotNull() {
            addCriterion("DMZH is not null");
            return (Criteria) this;
        }

        public Criteria andDmzhEqualTo(String value) {
            addCriterion("DMZH =", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhNotEqualTo(String value) {
            addCriterion("DMZH <>", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhGreaterThan(String value) {
            addCriterion("DMZH >", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhGreaterThanOrEqualTo(String value) {
            addCriterion("DMZH >=", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhLessThan(String value) {
            addCriterion("DMZH <", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhLessThanOrEqualTo(String value) {
            addCriterion("DMZH <=", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhLike(String value) {
            addCriterion("DMZH like", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhNotLike(String value) {
            addCriterion("DMZH not like", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhIn(List<String> values) {
            addCriterion("DMZH in", values, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhNotIn(List<String> values) {
            addCriterion("DMZH not in", values, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhBetween(String value1, String value2) {
            addCriterion("DMZH between", value1, value2, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhNotBetween(String value1, String value2) {
            addCriterion("DMZH not between", value1, value2, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqIsNull() {
            addCriterion("DMZHYXQ is null");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqIsNotNull() {
            addCriterion("DMZHYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqEqualTo(String value) {
            addCriterion("DMZHYXQ =", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqNotEqualTo(String value) {
            addCriterion("DMZHYXQ <>", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqGreaterThan(String value) {
            addCriterion("DMZHYXQ >", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqGreaterThanOrEqualTo(String value) {
            addCriterion("DMZHYXQ >=", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqLessThan(String value) {
            addCriterion("DMZHYXQ <", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqLessThanOrEqualTo(String value) {
            addCriterion("DMZHYXQ <=", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqLike(String value) {
            addCriterion("DMZHYXQ like", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqNotLike(String value) {
            addCriterion("DMZHYXQ not like", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqIn(List<String> values) {
            addCriterion("DMZHYXQ in", values, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqNotIn(List<String> values) {
            addCriterion("DMZHYXQ not in", values, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqBetween(String value1, String value2) {
            addCriterion("DMZHYXQ between", value1, value2, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqNotBetween(String value1, String value2) {
            addCriterion("DMZHYXQ not between", value1, value2, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzIsNull() {
            addCriterion("YYZZ is null");
            return (Criteria) this;
        }

        public Criteria andYyzzIsNotNull() {
            addCriterion("YYZZ is not null");
            return (Criteria) this;
        }

        public Criteria andYyzzEqualTo(String value) {
            addCriterion("YYZZ =", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzNotEqualTo(String value) {
            addCriterion("YYZZ <>", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzGreaterThan(String value) {
            addCriterion("YYZZ >", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzGreaterThanOrEqualTo(String value) {
            addCriterion("YYZZ >=", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzLessThan(String value) {
            addCriterion("YYZZ <", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzLessThanOrEqualTo(String value) {
            addCriterion("YYZZ <=", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzLike(String value) {
            addCriterion("YYZZ like", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzNotLike(String value) {
            addCriterion("YYZZ not like", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzIn(List<String> values) {
            addCriterion("YYZZ in", values, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzNotIn(List<String> values) {
            addCriterion("YYZZ not in", values, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzBetween(String value1, String value2) {
            addCriterion("YYZZ between", value1, value2, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzNotBetween(String value1, String value2) {
            addCriterion("YYZZ not between", value1, value2, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqIsNull() {
            addCriterion("YYZZYXQ is null");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqIsNotNull() {
            addCriterion("YYZZYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqEqualTo(String value) {
            addCriterion("YYZZYXQ =", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqNotEqualTo(String value) {
            addCriterion("YYZZYXQ <>", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqGreaterThan(String value) {
            addCriterion("YYZZYXQ >", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqGreaterThanOrEqualTo(String value) {
            addCriterion("YYZZYXQ >=", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqLessThan(String value) {
            addCriterion("YYZZYXQ <", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqLessThanOrEqualTo(String value) {
            addCriterion("YYZZYXQ <=", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqLike(String value) {
            addCriterion("YYZZYXQ like", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqNotLike(String value) {
            addCriterion("YYZZYXQ not like", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqIn(List<String> values) {
            addCriterion("YYZZYXQ in", values, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqNotIn(List<String> values) {
            addCriterion("YYZZYXQ not in", values, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqBetween(String value1, String value2) {
            addCriterion("YYZZYXQ between", value1, value2, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqNotBetween(String value1, String value2) {
            addCriterion("YYZZYXQ not between", value1, value2, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzIsNull() {
            addCriterion("XYZ is null");
            return (Criteria) this;
        }

        public Criteria andXyzIsNotNull() {
            addCriterion("XYZ is not null");
            return (Criteria) this;
        }

        public Criteria andXyzEqualTo(String value) {
            addCriterion("XYZ =", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzNotEqualTo(String value) {
            addCriterion("XYZ <>", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzGreaterThan(String value) {
            addCriterion("XYZ >", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzGreaterThanOrEqualTo(String value) {
            addCriterion("XYZ >=", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzLessThan(String value) {
            addCriterion("XYZ <", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzLessThanOrEqualTo(String value) {
            addCriterion("XYZ <=", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzLike(String value) {
            addCriterion("XYZ like", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzNotLike(String value) {
            addCriterion("XYZ not like", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzIn(List<String> values) {
            addCriterion("XYZ in", values, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzNotIn(List<String> values) {
            addCriterion("XYZ not in", values, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzBetween(String value1, String value2) {
            addCriterion("XYZ between", value1, value2, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzNotBetween(String value1, String value2) {
            addCriterion("XYZ not between", value1, value2, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzbmIsNull() {
            addCriterion("XYZBM is null");
            return (Criteria) this;
        }

        public Criteria andXyzbmIsNotNull() {
            addCriterion("XYZBM is not null");
            return (Criteria) this;
        }

        public Criteria andXyzbmEqualTo(String value) {
            addCriterion("XYZBM =", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmNotEqualTo(String value) {
            addCriterion("XYZBM <>", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmGreaterThan(String value) {
            addCriterion("XYZBM >", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmGreaterThanOrEqualTo(String value) {
            addCriterion("XYZBM >=", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmLessThan(String value) {
            addCriterion("XYZBM <", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmLessThanOrEqualTo(String value) {
            addCriterion("XYZBM <=", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmLike(String value) {
            addCriterion("XYZBM like", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmNotLike(String value) {
            addCriterion("XYZBM not like", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmIn(List<String> values) {
            addCriterion("XYZBM in", values, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmNotIn(List<String> values) {
            addCriterion("XYZBM not in", values, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmBetween(String value1, String value2) {
            addCriterion("XYZBM between", value1, value2, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmNotBetween(String value1, String value2) {
            addCriterion("XYZBM not between", value1, value2, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzyxqIsNull() {
            addCriterion("XYZYXQ is null");
            return (Criteria) this;
        }

        public Criteria andXyzyxqIsNotNull() {
            addCriterion("XYZYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andXyzyxqEqualTo(String value) {
            addCriterion("XYZYXQ =", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqNotEqualTo(String value) {
            addCriterion("XYZYXQ <>", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqGreaterThan(String value) {
            addCriterion("XYZYXQ >", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqGreaterThanOrEqualTo(String value) {
            addCriterion("XYZYXQ >=", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqLessThan(String value) {
            addCriterion("XYZYXQ <", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqLessThanOrEqualTo(String value) {
            addCriterion("XYZYXQ <=", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqLike(String value) {
            addCriterion("XYZYXQ like", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqNotLike(String value) {
            addCriterion("XYZYXQ not like", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqIn(List<String> values) {
            addCriterion("XYZYXQ in", values, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqNotIn(List<String> values) {
            addCriterion("XYZYXQ not in", values, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqBetween(String value1, String value2) {
            addCriterion("XYZYXQ between", value1, value2, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqNotBetween(String value1, String value2) {
            addCriterion("XYZYXQ not between", value1, value2, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andGdzcIsNull() {
            addCriterion("GDZC is null");
            return (Criteria) this;
        }

        public Criteria andGdzcIsNotNull() {
            addCriterion("GDZC is not null");
            return (Criteria) this;
        }

        public Criteria andGdzcEqualTo(String value) {
            addCriterion("GDZC =", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcNotEqualTo(String value) {
            addCriterion("GDZC <>", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcGreaterThan(String value) {
            addCriterion("GDZC >", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcGreaterThanOrEqualTo(String value) {
            addCriterion("GDZC >=", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcLessThan(String value) {
            addCriterion("GDZC <", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcLessThanOrEqualTo(String value) {
            addCriterion("GDZC <=", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcLike(String value) {
            addCriterion("GDZC like", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcNotLike(String value) {
            addCriterion("GDZC not like", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcIn(List<String> values) {
            addCriterion("GDZC in", values, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcNotIn(List<String> values) {
            addCriterion("GDZC not in", values, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcBetween(String value1, String value2) {
            addCriterion("GDZC between", value1, value2, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcNotBetween(String value1, String value2) {
            addCriterion("GDZC not between", value1, value2, "gdzc");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
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