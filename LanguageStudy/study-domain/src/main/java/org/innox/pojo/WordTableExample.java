package org.innox.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WordTableExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
    public WordTableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
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

        public Criteria andWordIdIsNull() {
            addCriterion("word_id is null");
            return (Criteria) this;
        }

        public Criteria andWordIdIsNotNull() {
            addCriterion("word_id is not null");
            return (Criteria) this;
        }

        public Criteria andWordIdEqualTo(Long value) {
            addCriterion("word_id =", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdNotEqualTo(Long value) {
            addCriterion("word_id <>", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdGreaterThan(Long value) {
            addCriterion("word_id >", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("word_id >=", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdLessThan(Long value) {
            addCriterion("word_id <", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdLessThanOrEqualTo(Long value) {
            addCriterion("word_id <=", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdIn(List<Long> values) {
            addCriterion("word_id in", values, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdNotIn(List<Long> values) {
            addCriterion("word_id not in", values, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdBetween(Long value1, Long value2) {
            addCriterion("word_id between", value1, value2, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdNotBetween(Long value1, Long value2) {
            addCriterion("word_id not between", value1, value2, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordNameTranslateIsNull() {
            addCriterion("word_name_translate is null");
            return (Criteria) this;
        }

        public Criteria andWordNameTranslateIsNotNull() {
            addCriterion("word_name_translate is not null");
            return (Criteria) this;
        }

        public Criteria andWordNameTranslateEqualTo(String value) {
            addCriterion("word_name_translate =", value, "wordNameTranslate");
            return (Criteria) this;
        }

        public Criteria andWordNameTranslateNotEqualTo(String value) {
            addCriterion("word_name_translate <>", value, "wordNameTranslate");
            return (Criteria) this;
        }

        public Criteria andWordNameTranslateGreaterThan(String value) {
            addCriterion("word_name_translate >", value, "wordNameTranslate");
            return (Criteria) this;
        }

        public Criteria andWordNameTranslateGreaterThanOrEqualTo(String value) {
            addCriterion("word_name_translate >=", value, "wordNameTranslate");
            return (Criteria) this;
        }

        public Criteria andWordNameTranslateLessThan(String value) {
            addCriterion("word_name_translate <", value, "wordNameTranslate");
            return (Criteria) this;
        }

        public Criteria andWordNameTranslateLessThanOrEqualTo(String value) {
            addCriterion("word_name_translate <=", value, "wordNameTranslate");
            return (Criteria) this;
        }

        public Criteria andWordNameTranslateLike(String value) {
            addCriterion("word_name_translate like", value, "wordNameTranslate");
            return (Criteria) this;
        }

        public Criteria andWordNameTranslateNotLike(String value) {
            addCriterion("word_name_translate not like", value, "wordNameTranslate");
            return (Criteria) this;
        }

        public Criteria andWordNameTranslateIn(List<String> values) {
            addCriterion("word_name_translate in", values, "wordNameTranslate");
            return (Criteria) this;
        }

        public Criteria andWordNameTranslateNotIn(List<String> values) {
            addCriterion("word_name_translate not in", values, "wordNameTranslate");
            return (Criteria) this;
        }

        public Criteria andWordNameTranslateBetween(String value1, String value2) {
            addCriterion("word_name_translate between", value1, value2, "wordNameTranslate");
            return (Criteria) this;
        }

        public Criteria andWordNameTranslateNotBetween(String value1, String value2) {
            addCriterion("word_name_translate not between", value1, value2, "wordNameTranslate");
            return (Criteria) this;
        }

        public Criteria andWordNameOrignalIsNull() {
            addCriterion("word_name_orignal is null");
            return (Criteria) this;
        }

        public Criteria andWordNameOrignalIsNotNull() {
            addCriterion("word_name_orignal is not null");
            return (Criteria) this;
        }

        public Criteria andWordNameOrignalEqualTo(String value) {
            addCriterion("word_name_orignal =", value, "wordNameOrignal");
            return (Criteria) this;
        }

        public Criteria andWordNameOrignalNotEqualTo(String value) {
            addCriterion("word_name_orignal <>", value, "wordNameOrignal");
            return (Criteria) this;
        }

        public Criteria andWordNameOrignalGreaterThan(String value) {
            addCriterion("word_name_orignal >", value, "wordNameOrignal");
            return (Criteria) this;
        }

        public Criteria andWordNameOrignalGreaterThanOrEqualTo(String value) {
            addCriterion("word_name_orignal >=", value, "wordNameOrignal");
            return (Criteria) this;
        }

        public Criteria andWordNameOrignalLessThan(String value) {
            addCriterion("word_name_orignal <", value, "wordNameOrignal");
            return (Criteria) this;
        }

        public Criteria andWordNameOrignalLessThanOrEqualTo(String value) {
            addCriterion("word_name_orignal <=", value, "wordNameOrignal");
            return (Criteria) this;
        }

        public Criteria andWordNameOrignalLike(String value) {
            addCriterion("word_name_orignal like", value, "wordNameOrignal");
            return (Criteria) this;
        }

        public Criteria andWordNameOrignalNotLike(String value) {
            addCriterion("word_name_orignal not like", value, "wordNameOrignal");
            return (Criteria) this;
        }

        public Criteria andWordNameOrignalIn(List<String> values) {
            addCriterion("word_name_orignal in", values, "wordNameOrignal");
            return (Criteria) this;
        }

        public Criteria andWordNameOrignalNotIn(List<String> values) {
            addCriterion("word_name_orignal not in", values, "wordNameOrignal");
            return (Criteria) this;
        }

        public Criteria andWordNameOrignalBetween(String value1, String value2) {
            addCriterion("word_name_orignal between", value1, value2, "wordNameOrignal");
            return (Criteria) this;
        }

        public Criteria andWordNameOrignalNotBetween(String value1, String value2) {
            addCriterion("word_name_orignal not between", value1, value2, "wordNameOrignal");
            return (Criteria) this;
        }

        public Criteria andWordTypeIsNull() {
            addCriterion("word_type is null");
            return (Criteria) this;
        }

        public Criteria andWordTypeIsNotNull() {
            addCriterion("word_type is not null");
            return (Criteria) this;
        }

        public Criteria andWordTypeEqualTo(Object value) {
            addCriterion("word_type =", value, "wordType");
            return (Criteria) this;
        }

        public Criteria andWordTypeNotEqualTo(Object value) {
            addCriterion("word_type <>", value, "wordType");
            return (Criteria) this;
        }

        public Criteria andWordTypeGreaterThan(Object value) {
            addCriterion("word_type >", value, "wordType");
            return (Criteria) this;
        }

        public Criteria andWordTypeGreaterThanOrEqualTo(Object value) {
            addCriterion("word_type >=", value, "wordType");
            return (Criteria) this;
        }

        public Criteria andWordTypeLessThan(Object value) {
            addCriterion("word_type <", value, "wordType");
            return (Criteria) this;
        }

        public Criteria andWordTypeLessThanOrEqualTo(Object value) {
            addCriterion("word_type <=", value, "wordType");
            return (Criteria) this;
        }

        public Criteria andWordTypeIn(List<Object> values) {
            addCriterion("word_type in", values, "wordType");
            return (Criteria) this;
        }

        public Criteria andWordTypeNotIn(List<Object> values) {
            addCriterion("word_type not in", values, "wordType");
            return (Criteria) this;
        }

        public Criteria andWordTypeBetween(Object value1, Object value2) {
            addCriterion("word_type between", value1, value2, "wordType");
            return (Criteria) this;
        }

        public Criteria andWordTypeNotBetween(Object value1, Object value2) {
            addCriterion("word_type not between", value1, value2, "wordType");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table word_table
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 26 20:05:47 JST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table word_table
     *
     * @mbg.generated Mon Apr 26 20:05:47 JST 2021
     */
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