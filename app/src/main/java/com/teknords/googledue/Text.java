package com.teknords.googledue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class Text extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("ca-app-pub-1261846064716355/9584487822").build();
        mAdView.loadAd(adRequest);
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("selectedDua", 0);//here 0 is default value

        String[] txtList = new String[]{

                "Set up Google DuoGoogle Duo is now available in the United States. The app will expand more countries in the coming days.You can use Duo to call your family, friends, and anyone else who uses the app.ANDROID IPHONE & IPADWhat you need to get startedA phone number with SMS service to receive a verification codeDownload the app: Get Duo for AndroidWhen prompted, give access to your device's contacts so you can find friends to call. Your contacts will only be used to find who you can call with Duo.Also, give access to your SMS, microphone and camera. When you sign in, Duo asks for SMS permission to send your verification code. But if you reject SMS, you can still use the app. You can control your app permissions through your Android settingsVerify your phone numberDuo will ask you to confirm your phone number. By verifying your number, you also allow others who have your number to see that you use Duo and call you using the app. This won't make your number visible to others.When you verify your number, people with your number can connect with you across Google services. You also allow Duo to periodically send your contacts and location to Google.How to verify your phone numberProblems verifying your phone numberWhat you can do with DuoHere are some things you can do with the app:Easy video calls with anyone in your contacts who use Duo: Call friends and family with high-quality audio and video. The quality will also adjust automatically if your connection is spotty.Cross-platform: Video call all your friends across all smartphones with just one simple app.Knock Knock: You can see a live video preview before answering the call when one of your contacts calls.End-to-end encryption: Your calls are secure and can only be seen by you and the person you're talking with.",
                "How To Find and in" +
                        "vite contactsYou can find a person to call through Duo if they're in your contacts and they also use the app. If they're not in your contacts but they use Duo, you can add them.Find contactsYou'll see someone in your contacts in Duo only if they also use the app.1.\tOpen Duo.2.\tTap Video call.3.\tYou can tap their name in the contacts list. Or you can enter their name or phone number in the search box.If you can't find someone in the app's contactsIf you don't see a contact you're looking for, first check the following:•\tGo to your phone's Contacts. Check that the person you're trying to reach is listed there.•\tMake sure the person you want to call has Duo. Currently, you can only call other Duo users.•\tIf the person isn't in your Contacts: Add them and make sure they have Duo before you call them.•\tIf the person you want to call is in your Contacts and has Duo but you still can't find them,How To Invite someone to Google DuoIf one of your contacts isn't using Duo, you can invite them to download the app so you can make video calls with one another.1.\tTap Video call. 2.\tLook for the contact you want to invite, and tap Invite. 3.\tYour default SMS app will open with a pre-loaded invitation message. Tap Send.  The recipient will get the message and can then download the app or reply directly to the notification.Tips for using Google DuoYou can use Google Duo to make video calls to your family, friends, and anyone else who uses the app. Your calls are encrypted, which means they're private to you and the person you're calling.If you're just getting started with Duo, here are some tips to help you get the most out of your experience.How To Make calls to other kinds of phonesYou can make video calls to all your friends on smartphones with Google Duo , even if you don't have the same kind of phone as they do. You just need to make sure your contact has Duo installed.See a video preview with Knock KnockWhen you call a contact using Duo, the other person can see live video of you while the phone rings if they have you as a contact. You won't be able to see the person you're calling until they answer.You can also turn Knock Knock off.Turn Knock Knock on or offWhen you call someone using Duo, the other person can see live video of you while the phone rings if they have you as a contact. You won't be able to see the person you're calling until they answer.You’ll also only see video from callers you has contacts.To turn Knock Knock on1.\tOpen Duo.2.\tIn the top right corner, tap More Settings  Knock Knock.3.\tSwitch Knock Knock to On . Or tap again to turn off.How To Get great video and audio qualityTo make sure you're looking and sounding your best for a video call:1.\tMake sure you have lots of light. For the best lighting, put two lights behind your device facing you and one behind you.2.\tHold your device at eye level so the camera is pointed at your face.3.\tMake sure nothing (ex: your finger) is blocking your device's camera or microphone.4.\tConnect to Wi-Fi before calling. If you can't, turn on your data.If you're having problems with your video call, try fixing your call quality.How To Use less dataIf you can't connect to a Wi-Fi network, Duo automatically lowers your connection to 1Mbps. If you have plenty of data on your mobile plan and don't want to limit the quality, you can turn off Limit mobile data usage in Settings.Limit mobile data usageIf you're running out of monthly data on your mobile plan, here's how you can lower how much data you're using.Note: When your device is connected to Wi-Fi, Duo still uses a small amount of mobile data. This keeps your conversation going if the Wi-Fi drops. To stop using mobile data as a backup, follow the instructions in \"Turn mobile data off.\"Connect to Wi-FiBefore you make or answer calls, make sure your mobile device is connected to a Wi-Fi network.Manage mobile data useIf you want to lower your data use or change your call quality, you can limit, increase, or switch mobile data on or off.Limit mobile data usageIf you can't connect to a Wi-Fi network, Duo automatically lowers your connection to 1Mbps.1.\tIn the top right corner, tap More   Settings.2.\tSwitch \"Limit mobile data usage\" on or off.Turn mobile data offIf you want to make sure Duo uses only Wi-Fi and not your mobile data, you can turn mobile data off on your phone.1.\tOn your iPhone or iPad, open the device's Settings  Cellular.2.\tSwitch \"Cellular Data\" off.Block numbersFor unwanted phone calls, you can also block a phone number from calling you.",
                "Start a callYou can make calls to anyone in your contacts who also uses Duo.Before starting a call, you can learn how you can find and add people to call.Start a new callOpen Duo.Tap Video call. Find the contact to call. Or if you've made recent calls, tap the contact you want to call.To end the call, tap End call Call end icon.ANDROID IPHONE & IPADAnswer or decline a callWhen your phone is unlockedAnswer a call: Tap Accept.Reject a call: Tap Decline.Silence the ringer: Press one of the phone's volume buttons.When your phone is lockedAnswer a call: Swipe up to answer the call.Reject a call: Press the phone's power button.Silence the ringer: Press one of the phone's volume buttons.",
                "Fix video call connectionIf you can't connect to Duo, the app or connection may be having issues.ANDROID IPHONE & IPADHere are a few things you can try to fix the problem:Make sure you're connected to the InternetRestart the appRestart your deviceVideo or audio issues during callIf the video or audio isn't working right during a call, you and the person you're talking with should check the following:Make sure nothing is blocking the device's camera or microphone.Check that the camera and microphone are facing the right way.Check your cellular or Wi-Fi connection. If your connection is weak, video or sound might not work correctly.Restart the app and try again.Restart your phone and try again.Low battery or poor signalIf you have low battery on your device or a poor cell or Wi-Fi signal, Duo may lower the quality of the call or turn video off.To improve your quality:Low battery: Charge your device.Poor signal: Connect to a Wi-Fi network or try the call again when you have a stronger signal.",
                "Set phone to vibrate for callsYou can set your phone to vibrate while ringing when you get a video call in Duo. As long as you don't have the phone's sound muted, the phone will ring and vibrate.Note: This setting is only available for Android phones.Open Duo.In the top right corner, tap More More.Tap Settings and then Vibrate for calls.",
                "Disconnect your phone number from Google DuoIf you want to stop using Duo, you can unregister your number.If you're using your phone number with other Google services, you'll need to disconnect it from those services separately.Disconnect your phone numberANDROID IPHONE & IPADOpen Duo.In the top right corner, tap MoreMore.Tap Settings and then Unregister phone number.Re-connect your phone number to DuoIf you unregistered your number from Duo, you'll be asked to confirm your phone number the next time you open the app. By verifying your number, you also allow others who have your number to see that you use Duo and can call you using the app. This won’t make your number visible to others.When you verify your number, people with your number can connect with you across Google services. You also allow Duo to periodically send your contacts and location to Google.Enter your phone number and make sure it's correct.Tap Next.Duo will send you a code in a one-time text message to the number that you verified. (Carrier text-message rates may apply.)Enter the code that you received in the text message.If you don’t receive a text message, tap Resend SMS.If you have a cell connection and aren't getting the SMS, request a call by tapping Call me.If you continue having problems verifying your phone number, you can also see the section below.",
                    "Can’t verify phone numberGoogle Duo is now available in the United States. The app will expand more countries in the coming days.If you’re having problems verifying your phone number through Duo, try the following steps to finish verifying your phone number:1. Check your phone numberMake sure your phone number was entered correctly with the right country code. 2. Check for a good Wi-Fi or mobile data connectionCheck your settings to make sure Wi-Fi or mobile data is turned on and airplane mode is turned off.Move to where you have a better mobile data connection. Your network signal icon should have at least 1 bar.Test your connections by visiting a website.3. Make sure that you can get the SMS verification codeCheck that your cell signal is on and that your airplane mode is turned off.If your signal is weak, move to where you have a better cell signal. Your network signal icon should have at least 1 bar.Test your connections by sending yourself an SMS.4. Request a new verification codeOn the verification code screen, you can ask for the code again.If you don’t receive a text message, tap Resend SMS.If you have a cell connection and aren't getting the SMS, request a call by tapping Call me.5. Try fixing the appANDROID IPHONE & IPADQuit & restart: Go to your device’s Settings and then Apps and then Duo and then Force Stop. Open Duo again.Uninstall and re-install the app: Try uninstalling Duo. Then re-download Duo and open the app.Restart your phone: Try turning your phone off and turning it back on. Then open Duo again.",
                "Can't find or sync contactsIf you're having problems finding or syncing contacts, try the steps below.1. Check access to contactsWhen you set up Duo, you may not have given the app permission to access to your contacts. If you didn't, you'll see a message asking you for access when you try to start a new call.ANDROID IPHONE & IPADMake sure you've given Duo access to your contacts.Go to your device's Settings.Tap Applications and then Application Manager and then Duo and then Permissions.On some devices, you may need to go to Apps and then Duo and then Permissions.Switch Contacts to On On.2. Check your phone's ContactsGo to your phone's Contacts. Check that the person you're trying to reach is listed there.If the person isn't in your Contacts: Add them and make sure they're Duo users before you call them.3. Check that the contact uses DuoMake sure your contact uses Duo. Currently, you can only call other Duo users.4. Report an issueIf the person you want to chat with is in your Contacts and uses Duo, but you still can't find them, send us feedback."};
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(txtList[intValue]);
        textView.setText(txtList[intValue]);
        textView.setMovementMethod(new ScrollingMovementMethod());



        Button button= (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Text.this, MainActivity.class);
                startActivity(i);
                mInterstitialAd = new InterstitialAd(getApplicationContext());
                mInterstitialAd.setAdUnitId("ca-app-pub-1261846064716355/2061221022");
                AdRequest adRequestInter = new AdRequest.Builder().build();
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdLoaded() {
                        mInterstitialAd.show();
                    }
                });
                mInterstitialAd.loadAd(adRequestInter);
            }
        });











        }
    }