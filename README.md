# EE433 Immutable Collections Assignment

**Instructions** in the compiled language of your choice, demonstrate a mutable
and immutable collection. Examples include collections such as array lists or
dictionaries that accept objects or key/object pairs. Demonstrations of concept
may be done via command line and file I/O.

While not essential, you will save yourself some time if you look into mutable
collections that can be accessed via multiple threads.

Deliverable(s) working source code in the compiled language of your choice.

## TODO

* Explanation
  * [ ] Define collection
  * [ ] Define mutable
  * [ ] Define immutable
  * [ ] Differentiate between an immutable collection and immutable object
  * [ ] Explain how objects within an immutable collection may be modified,
        while the collection, or list, may not be modified.
  * [ ] State that this allows for immutable collections to be accessed using multiple threads.

* **CODE**
  * [ ] Generate class with mutable attributes.
  * [ ] Generate servant class to write this class to a CSV
  * [ ] Generate servant class to read this class from a CSV as read-only
        (immutable) or editable (mutable)
  * [ ] Generate interactive command line interface to:
  * [ ] 1. Populate ImmutableLIst
  * [ ] 2. Attempt to add item to list (error)
  * [ ] 3. Attempt to remove item from list (error)
  * [ ] 4. Read an object and modify it (success)
  * [ ] Repeat 1-4 with mutable list and note differences
