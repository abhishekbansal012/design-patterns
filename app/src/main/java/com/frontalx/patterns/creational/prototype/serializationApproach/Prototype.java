package com.frontalx.patterns.creational.prototype.serializationApproach;

import java.io.Serializable;

public interface Prototype extends Serializable {
  Prototype deepClone();
}
