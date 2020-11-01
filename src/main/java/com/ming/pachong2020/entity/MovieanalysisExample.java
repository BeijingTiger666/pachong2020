package com.ming.pachong2020.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovieanalysisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieanalysisExample() {
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

        public Criteria andMovieIdIsNull() {
            addCriterion("movie_id is null");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNotNull() {
            addCriterion("movie_id is not null");
            return (Criteria) this;
        }

        public Criteria andMovieIdEqualTo(Integer value) {
            addCriterion("movie_id =", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotEqualTo(Integer value) {
            addCriterion("movie_id <>", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThan(Integer value) {
            addCriterion("movie_id >", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("movie_id >=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThan(Integer value) {
            addCriterion("movie_id <", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThanOrEqualTo(Integer value) {
            addCriterion("movie_id <=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdIn(List<Integer> values) {
            addCriterion("movie_id in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotIn(List<Integer> values) {
            addCriterion("movie_id not in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdBetween(Integer value1, Integer value2) {
            addCriterion("movie_id between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotBetween(Integer value1, Integer value2) {
            addCriterion("movie_id not between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNull() {
            addCriterion("detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(Integer value) {
            addCriterion("detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(Integer value) {
            addCriterion("detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(Integer value) {
            addCriterion("detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(Integer value) {
            addCriterion("detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<Integer> values) {
            addCriterion("detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<Integer> values) {
            addCriterion("detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_id not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNull() {
            addCriterion("movie_name is null");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNotNull() {
            addCriterion("movie_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieNameEqualTo(String value) {
            addCriterion("movie_name =", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotEqualTo(String value) {
            addCriterion("movie_name <>", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThan(String value) {
            addCriterion("movie_name >", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_name >=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThan(String value) {
            addCriterion("movie_name <", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThanOrEqualTo(String value) {
            addCriterion("movie_name <=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLike(String value) {
            addCriterion("movie_name like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotLike(String value) {
            addCriterion("movie_name not like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameIn(List<String> values) {
            addCriterion("movie_name in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotIn(List<String> values) {
            addCriterion("movie_name not in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameBetween(String value1, String value2) {
            addCriterion("movie_name between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotBetween(String value1, String value2) {
            addCriterion("movie_name not between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andNamehashIsNull() {
            addCriterion("namehash is null");
            return (Criteria) this;
        }

        public Criteria andNamehashIsNotNull() {
            addCriterion("namehash is not null");
            return (Criteria) this;
        }

        public Criteria andNamehashEqualTo(String value) {
            addCriterion("namehash =", value, "namehash");
            return (Criteria) this;
        }

        public Criteria andNamehashNotEqualTo(String value) {
            addCriterion("namehash <>", value, "namehash");
            return (Criteria) this;
        }

        public Criteria andNamehashGreaterThan(String value) {
            addCriterion("namehash >", value, "namehash");
            return (Criteria) this;
        }

        public Criteria andNamehashGreaterThanOrEqualTo(String value) {
            addCriterion("namehash >=", value, "namehash");
            return (Criteria) this;
        }

        public Criteria andNamehashLessThan(String value) {
            addCriterion("namehash <", value, "namehash");
            return (Criteria) this;
        }

        public Criteria andNamehashLessThanOrEqualTo(String value) {
            addCriterion("namehash <=", value, "namehash");
            return (Criteria) this;
        }

        public Criteria andNamehashLike(String value) {
            addCriterion("namehash like", value, "namehash");
            return (Criteria) this;
        }

        public Criteria andNamehashNotLike(String value) {
            addCriterion("namehash not like", value, "namehash");
            return (Criteria) this;
        }

        public Criteria andNamehashIn(List<String> values) {
            addCriterion("namehash in", values, "namehash");
            return (Criteria) this;
        }

        public Criteria andNamehashNotIn(List<String> values) {
            addCriterion("namehash not in", values, "namehash");
            return (Criteria) this;
        }

        public Criteria andNamehashBetween(String value1, String value2) {
            addCriterion("namehash between", value1, value2, "namehash");
            return (Criteria) this;
        }

        public Criteria andNamehashNotBetween(String value1, String value2) {
            addCriterion("namehash not between", value1, value2, "namehash");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIsNull() {
            addCriterion("movie_type is null");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIsNotNull() {
            addCriterion("movie_type is not null");
            return (Criteria) this;
        }

        public Criteria andMovieTypeEqualTo(String value) {
            addCriterion("movie_type =", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotEqualTo(String value) {
            addCriterion("movie_type <>", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeGreaterThan(String value) {
            addCriterion("movie_type >", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeGreaterThanOrEqualTo(String value) {
            addCriterion("movie_type >=", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLessThan(String value) {
            addCriterion("movie_type <", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLessThanOrEqualTo(String value) {
            addCriterion("movie_type <=", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLike(String value) {
            addCriterion("movie_type like", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotLike(String value) {
            addCriterion("movie_type not like", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIn(List<String> values) {
            addCriterion("movie_type in", values, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotIn(List<String> values) {
            addCriterion("movie_type not in", values, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeBetween(String value1, String value2) {
            addCriterion("movie_type between", value1, value2, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotBetween(String value1, String value2) {
            addCriterion("movie_type not between", value1, value2, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieUrlIsNull() {
            addCriterion("movie_url is null");
            return (Criteria) this;
        }

        public Criteria andMovieUrlIsNotNull() {
            addCriterion("movie_url is not null");
            return (Criteria) this;
        }

        public Criteria andMovieUrlEqualTo(String value) {
            addCriterion("movie_url =", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlNotEqualTo(String value) {
            addCriterion("movie_url <>", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlGreaterThan(String value) {
            addCriterion("movie_url >", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlGreaterThanOrEqualTo(String value) {
            addCriterion("movie_url >=", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlLessThan(String value) {
            addCriterion("movie_url <", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlLessThanOrEqualTo(String value) {
            addCriterion("movie_url <=", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlLike(String value) {
            addCriterion("movie_url like", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlNotLike(String value) {
            addCriterion("movie_url not like", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlIn(List<String> values) {
            addCriterion("movie_url in", values, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlNotIn(List<String> values) {
            addCriterion("movie_url not in", values, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlBetween(String value1, String value2) {
            addCriterion("movie_url between", value1, value2, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlNotBetween(String value1, String value2) {
            addCriterion("movie_url not between", value1, value2, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andCollectingTimeIsNull() {
            addCriterion("collecting_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectingTimeIsNotNull() {
            addCriterion("collecting_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectingTimeEqualTo(Date value) {
            addCriterion("collecting_time =", value, "collectingTime");
            return (Criteria) this;
        }

        public Criteria andCollectingTimeNotEqualTo(Date value) {
            addCriterion("collecting_time <>", value, "collectingTime");
            return (Criteria) this;
        }

        public Criteria andCollectingTimeGreaterThan(Date value) {
            addCriterion("collecting_time >", value, "collectingTime");
            return (Criteria) this;
        }

        public Criteria andCollectingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collecting_time >=", value, "collectingTime");
            return (Criteria) this;
        }

        public Criteria andCollectingTimeLessThan(Date value) {
            addCriterion("collecting_time <", value, "collectingTime");
            return (Criteria) this;
        }

        public Criteria andCollectingTimeLessThanOrEqualTo(Date value) {
            addCriterion("collecting_time <=", value, "collectingTime");
            return (Criteria) this;
        }

        public Criteria andCollectingTimeIn(List<Date> values) {
            addCriterion("collecting_time in", values, "collectingTime");
            return (Criteria) this;
        }

        public Criteria andCollectingTimeNotIn(List<Date> values) {
            addCriterion("collecting_time not in", values, "collectingTime");
            return (Criteria) this;
        }

        public Criteria andCollectingTimeBetween(Date value1, Date value2) {
            addCriterion("collecting_time between", value1, value2, "collectingTime");
            return (Criteria) this;
        }

        public Criteria andCollectingTimeNotBetween(Date value1, Date value2) {
            addCriterion("collecting_time not between", value1, value2, "collectingTime");
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