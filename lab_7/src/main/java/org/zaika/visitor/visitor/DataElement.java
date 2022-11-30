package org.zaika.visitor.visitor;

public interface DataElement {
    void acceptOperation(DataElementVisitor visitor);
}