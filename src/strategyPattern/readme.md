Paid 200.50 using PayPal. Email: john.doe@example.com
Paid 99.99 using Google Pay. Phone Number: +1234567890
```

---

## 🔥 **Benefits of Using Strategy Pattern**
1. **Open/Closed Principle**:  
   We can easily add **new payment methods (like Apple Pay, Crypto, etc.)** without changing existing code.

2. **Runtime Strategy Selection**:  
   We can **dynamically select the strategy** at runtime. For example, you can prompt the user to choose a payment method.

3. **Code Reusability**:  
   Each strategy is a **standalone class**, so it can be reused in other projects or contexts.

4. **Removes If-Else Conditions**:  
   Without Strategy Pattern, you'd have a giant `if-else` like:
   ```java
   if (paymentType == "CreditCard") {
      // do something
   } else if (paymentType == "PayPal") {
      // do something else
   }
   ```

---

## 💡 **Where is Strategy Pattern Used?**
- **Payment Gateways**: Credit Card, UPI, PayPal, etc.
- **Sorting Algorithms**: BubbleSort, MergeSort, QuickSort, etc.
- **Data Compression**: Zip, RAR, Tar, etc.
- **Navigation Systems**: Route finding (like Google Maps - fastest, shortest, eco-friendly route).
- **Game Development**: Different attack strategies for enemies (e.g., aggressive, defensive).

---

## **Summary**
| **Component**        | **Role**                |
|---------------------|-----------------------|
| **Strategy Interface** | Declares the interface for all supported algorithms.|
| **Concrete Strategy** | Implements different algorithms like CreditCard, PayPal, GooglePay.|
| **Context**           | Maintains a reference to a **Strategy** and uses it to call the algorithm.|
| **Main**              | The client selects and sets the strategy. |

---