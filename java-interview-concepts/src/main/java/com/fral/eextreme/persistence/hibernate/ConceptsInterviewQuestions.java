package com.fral.eextreme.persistence.hibernate;

public class ConceptsInterviewQuestions {
}

/**
 * Difference between get and load in Hibernate
 * ================================================================================================================
 * Difference between get and load method in Hibernate is a one of the most popular question asked in Hibernate and
 * spring interviews. Hibernate Session  class provides two method to access object e.g. session.get() and
 * session.load() both looked quite similar to each other but there are subtle difference between load and
 * get method which can affect performance of application. Main difference between get() vs load method is
 * that get() involves database hit if object doesn't exists in Session Cache and returns a fully initialized
 * object which may involve several database call while load method can return proxy in place and only initialize
 * the object or hit the database if any method other than getId() is called on persistent or entity object. This
 * lazy initialization can save couple of database round-trip which result in better performance.
 *
 *
 * Difference between Transient, Persistent, and Detached Objects in Hibernate
 * ================================================================================================================
 * In Hibernate framework, an entity can be in three states, transient, persistent, and detached. When an object is
 * in transient state, it is commonly refereed as transient object, similarly if it is in persistence and detached
 * state, it is known as persistent and detached object. When an entity is first created using the new operator
 * e.g. new User() and not associated with Hibernate session e.g. you haven't called session.save(user) method
 * then it is known as transient object. At this stage, Hibernate doesn't know anything about this object and the
 * object doesn't have any representation in database e.g. a corresponding row in the User table. Hibernate will
 * not run any SQL query to reflect any changes on this object. You can move this object into persistent state by
 * associating it with an hibernate session e.g. by calling save() or saveOrUpdate() method from an hibernate
 * Session.
 *
 *
 */
