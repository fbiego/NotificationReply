# NotificationReply
Reply to Android notifications programmatically



## Implementation on apps
- [`[auto-reply] bot on Whatsapp`](https://wa.link/hk1e10)
- [`Retweet app on Playstore`](https://fbiego.com/retweet/app?id=git)


### Code
```kotlin
if (body.startsWith("/hello")){
    reply(sbn, "Hello there")
}
if (body.startsWith("/about")){
    reply(sbn, "This is an automatic reply test")
}
```

##### Client sending the message

![1](client-side.jpeg?raw=true "3")

##### Server (android phone with app)
![1](server-side.jpeg?raw=true "3")