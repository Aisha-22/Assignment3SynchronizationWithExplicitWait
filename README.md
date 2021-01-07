Assignment3SynchronizationWithExplicitWait

About the project:
*Implicit and Explicit
>Is based on the search results
>When your code/test executes faster than your browser, test works with elements that are not there.
http://www.itgeared.com/demo/1506-ajax-loading.html

**Challenges
Still trying to understand the concept for Implicit and Explicit and the importants of it's use.

*Implicit Wait Machine:
> ImplicitWait is applied Globally - in a global level, it's telling the program to Waiting for a number of seconds before throwing exception.
Initially it's saying, So whenever I tell my driver to click on something and the results are not found, please don't fail immediately,
wait for a number of seconds
Advantages: Defining it globally, so that is there is a 100 steps in your application then each and every step there is wait time, because you are
clicking 100 clicks which navigate to 100 pages, so each page has a time limit to load, so if you declare it once globally that that's it

*Explicit Wait:
>Is used to target specific Elements e.g specific to all location searches

>Implicit and Explicit are both are combined used to achieve synchronization successfully in a realtime project.