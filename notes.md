* Lightweight development
* EJB

``` java
	class Account {
		balance, accountNumber;
		deposit(amount) {}
		withdraw(amount) {}
		transferFund(to, amount) {}
	}

```
* Maintain a pool of Account objects
* __transferFund__ has a couple of DB operations. You don't want a partial outcome. Say deduct operation is successful, but the credit to other account fails.
* Transaction service for __transferFund__
* Extra layer of Security for __withdraw__ method

* Difficult reinventing the wheel for your code
* Enterprise Java Beans
* 
``` java
 interface Account extends Remote {
 	...
 }
 interface AccountHome {
  ...
 }
 class AccountBean implements EntityBean {
 	//Your class cannot have constructors; no final variables; no static members; should not use throws keyword; cannot extend some other class;
 }
 //ejb-jar.xml
 //Zip all these 4 items
```
* Download and install an EJB container(JBoss, Weblogic, Websphere)
* Drop this zip file in the container
* You configure the container specifying what services your bean requires;
* EJB is a very heavyweight

### Enters Spring

* Spring is a lightweight container
* Provides all the services like transaction, security, object pooling, messaging to your code without forcing you to change the design of the code
* Spring framework is POJO framework
* __Dependency Injection__: Simple mechanism by which you avoid writing unneccessary creation and lookup code.
* Create simple Java classes. Have your logic written there. Configure them using annotations or xml files. Configure the services you need. Run your application
* Spring framework will take care of all these










