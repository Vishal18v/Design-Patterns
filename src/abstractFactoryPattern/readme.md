
## 💡 **What's Different in the Revised Design?**
| **Before**               | **After**                          |
|-------------------------|-------------------------------------|
| **Single AbstractFactory** | **Separate ShapeFactory and ColorFactory** |
| **Violates ISP**           | **Follows ISP**                   |
| **ShapeFactory had getColor()** | No unused methods in **ShapeFactory**  |
| **ColorFactory had getShape()** | No unused methods in **ColorFactory**  |
| **FactoryProducer used AbstractFactory** | FactoryProducer returns **ShapeFactory** or **ColorFactory** as needed |

---

## ✅ **Design Principles Followed**
1. **SRP (Single Responsibility Principle)**:
    - **ShapeFactory** deals with shapes only.
    - **ColorFactory** deals with colors only.

2. **OCP (Open/Closed Principle)**:
    - We can add new factories like **FurnitureFactory** without modifying existing code.

3. **LSP (Liskov Substitution Principle)**:
    - No issues here since we always return interfaces from `getFactory()`.

4. **ISP (Interface Segregation Principle)**:
    - ShapeFactory no longer has `getColor()`.
    - ColorFactory no longer has `getShape()`.

---

## 📋 **Revised Output**
```
Drawing a Circle
Drawing a Rectangle
Filling with Red
Filling with Blue
```

---

## 🎉 **Key Takeaways**
1. **FactoryProducer** returns either **ShapeFactory** or **ColorFactory**, not a single "universal factory".
2. We removed the **unnecessary method implementations** for `getColor()` in ShapeFactory and `getShape()` in ColorFactory.
3. **Interface Segregation Principle (ISP) is fully satisfied.**
4. This structure is **more modular** and avoids forcing **empty methods**.

---