## PG.5

A and F

## PG.8

- Need to add a new feature
- Need to fix a defect
- Need to swap out technology in some piece of the system

## Notes

> Principle 1: "Identify the aspects of your application that vary and separate them from what stays the same"

> Principle 2: "Program to an interface, not an implementation"

Duck Sim code is in ~/Dev/Personal/DesignPatterns chapter1 package

> Principle 3: "Favor composition over inheritance. HAS-A is preferable to IS-A"

This chapter's pattern was called the STRATEGY PATTERN. It is a family of encapsulated interchangeable algorithms that allow them to vary independently of the client using them.

The Duck is an abstract class that composes the behavior classes for flying and quacking via the interface of those classes instead of the concrete implementation.