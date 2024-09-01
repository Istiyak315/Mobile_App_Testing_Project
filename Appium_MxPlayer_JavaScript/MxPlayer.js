describe('MX Player', () => {

    it('Perform Actions', async() => {

        //clicking on download button
        await $('//android.widget.LinearLayout[@resource-id="com.mxtech.videoplayer.ad:id/download_tab"]/android.widget.ImageView').click();
        
        //tap on twitter
        await $('(//android.widget.ImageView[@resource-id="com.mxtech.videoplayer.ad:id/home_link_item_logo"])[3]').click();

        // providing wait to load twitter
        await driver.pause(4000);

        // returning back on download page 
        await driver.back();
        await driver.back();

        
        // clicking on search option
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/tv_enter_hint"]').click();
        
        //entering data in search bar 
       const searchBar = await $('//android.widget.EditText[@resource-id="com.mxtech.videoplayer.ad:id/et_enter_edit"]');
       await searchBar.setValue('masai school');

       //pressing enter 
       await driver.keys(['\uE007']);
    });

    it('Handle Notification', async() => {

        // clicking on notification
        await driver.openNotifications();

        await driver.back();
       
    });

    it('App Switching', async() => {

        // switching to another app
        await driver.startActivity("io.appium.android.apis", "io.appium.android.apis.ApiDemos" );
        
    });
});