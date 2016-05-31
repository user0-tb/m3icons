package org.xphnx.ameixa;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.util.ArrayList;

public class IconActivity extends AppCompatActivity {

    private Integer[] mImages = {
			R.drawable.nodpi_game2048
			R.drawable.nodpi_editor920
			R.drawable.nodpi_aard
			R.drawable.nodpi_aat
			R.drawable.nodpi_acal
			R.drawable.nodpi_acaldav
			R.drawable.nodpi_adaway
			R.drawable.nodpi_addi
			R.drawable.nodpi_agit
			R.drawable.nodpi_aizoban
			R.drawable.nodpi_alogcat
			R.drawable.nodpi_alogcatroot
			R.drawable.nodpi_amaze
			R.drawable.nodpi_ametro
			R.drawable.nodpi_andbible
			R.drawable.nodpi_andquote
			R.drawable.nodpi_androbd
			R.drawable.nodpi_androidrun
			R.drawable.nodpi_androidvnc
			R.drawable.nodpi_androsens
			R.drawable.nodpi_andstatus
			R.drawable.nodpi_ankidroid
			R.drawable.nodpi_antennapod
			R.drawable.nodpi_antox
			R.drawable.nodpi_anymemo
			R.drawable.nodpi_apg
			R.drawable.nodpi_apkextractor
			R.drawable.nodpi_apktrack
			R.drawable.nodpi_applicationsinfo
			R.drawable.nodpi_apps
			R.drawable.nodpi_apvpdfreader
			R.drawable.nodpi_ardroid
			R.drawable.nodpi_arij
			R.drawable.nodpi_arxiv
			R.drawable.nodpi_asciicam
			R.drawable.nodpi_ask
			R.drawable.nodpi_atarashii
			R.drawable.nodpi_atomic
			R.drawable.nodpi_audiofx
			R.drawable.nodpi_aurora
			R.drawable.nodpi_authenticator
			R.drawable.nodpi_autostarts
			R.drawable.nodpi_barcodescanner
			R.drawable.nodpi_batteryfu
			R.drawable.nodpi_batterylevel
			R.drawable.nodpi_baumann
			R.drawable.nodpi_beamshare
			R.drawable.nodpi_beem
			R.drawable.nodpi_bipolalarm
			R.drawable.nodpi_birthdayadapter
			R.drawable.nodpi_bitcoin
			R.drawable.nodpi_bitconium
			R.drawable.nodpi_bites
			R.drawable.nodpi_bitmask
			R.drawable.nodpi_blockinger
			R.drawable.nodpi_bluemono
			R.drawable.nodpi_bluetooth
			R.drawable.nodpi_bobball
			R.drawable.nodpi_bombusmod
			R.drawable.nodpi_botbrew
			R.drawable.nodpi_broadcast
			R.drawable.nodpi_bronylivewallpaper
			R.drawable.nodpi_brouter
			R.drawable.nodpi_browser
			R.drawable.nodpi_bubble
			R.drawable.nodpi_bubblecomics
			R.drawable.nodpi_budget
			R.drawable.nodpi_bugreport
			R.drawable.nodpi_busybox
			R.drawable.nodpi_bvnc
			R.drawable.nodpi_cachecleaner
			R.drawable.nodpi_cadroid
			R.drawable.nodpi_calculator
			R.drawable.nodpi_calculator2
			R.drawable.nodpi_caldavsync
			R.drawable.nodpi_calendar
			R.drawable.nodpi_calendarie
			R.drawable.nodpi_calendarnotifications
			R.drawable.nodpi_calendarwidget
			R.drawable.nodpi_calendula
			R.drawable.nodpi_callerid
			R.drawable.nodpi_callrecorder
			R.drawable.nodpi_camcorder
			R.drawable.nodpi_camera2
			R.drawable.nodpi_candymemory
			R.drawable.nodpi_carcast
			R.drawable.nodpi_carreport
			R.drawable.nodpi_cathode
			R.drawable.nodpi_catlog
			R.drawable.nodpi_cgeo
			R.drawable.nodpi_chanu
			R.drawable.nodpi_characterrecognition
			R.drawable.nodpi_chatsecure
			R.drawable.nodpi_chess
			R.drawable.nodpi_chesswalk
			R.drawable.nodpi_chesswatch
			R.drawable.nodpi_chromium
			R.drawable.nodpi_cidrcalc
			R.drawable.nodpi_clementineremote
			R.drawable.nodpi_clipboardbeam
			R.drawable.nodpi_clipstack
			R.drawable.nodpi_clock
			R.drawable.nodpi_clover
			R.drawable.nodpi_cmaccount
			R.drawable.nodpi_cmbrowser
			R.drawable.nodpi_cmupdater
			R.drawable.nodpi_coinbase
			R.drawable.nodpi_coloring
			R.drawable.nodpi_communitycompass
			R.drawable.nodpi_compass
			R.drawable.nodpi_connectbot
			R.drawable.nodpi_constellations
			R.drawable.nodpi_contactmerger
			R.drawable.nodpi_contacts
			R.drawable.nodpi_conversations
			R.drawable.nodpi_coolreader
			R.drawable.nodpi_copay
			R.drawable.nodpi_counterme
			R.drawable.nodpi_criticalmaps
			R.drawable.nodpi_crocodilenote
			R.drawable.nodpi_crosswords
			R.drawable.nodpi_csipsimple
			R.drawable.nodpi_csploit2
			R.drawable.nodpi_cupsprintservice
			R.drawable.nodpi_currencyconverter
			R.drawable.nodpi_dashclock
			R.drawable.nodpi_datastats
			R.drawable.nodpi_davdroid
			R.drawable.nodpi_debiandroid
			R.drawable.nodpi_debiankit
			R.drawable.nodpi_defaulticon
			R.drawable.nodpi_deskcon
			R.drawable.nodpi_devicemanager
			R.drawable.nodpi_devtools
			R.drawable.nodpi_diasporanw
			R.drawable.nodpi_diasporawebclient
			R.drawable.nodpi_dictionaryformids
			R.drawable.nodpi_diktofon
			R.drawable.nodpi_dilbert
			R.drawable.nodpi_dimmer
			R.drawable.nodpi_disablemanager
			R.drawable.nodpi_diskusage
			R.drawable.nodpi_dnsman
			R.drawable.nodpi_documents
			R.drawable.nodpi_documentviewer
			R.drawable.nodpi_doomytorch
			R.drawable.nodpi_downloads
			R.drawable.nodpi_driibo
			R.drawable.nodpi_drinks
			R.drawable.nodpi_droidfish
			R.drawable.nodpi_droidshows
			R.drawable.nodpi_droidupnp
			R.drawable.nodpi_droidwall
			R.drawable.nodpi_droidweignt
			R.drawable.nodpi_drumon
			R.drawable.nodpi_dspmanager
			R.drawable.nodpi_dsub
			R.drawable.nodpi_duckduckgo
			R.drawable.nodpi_duckduckgo2
			R.drawable.nodpi_dumbphoneassistant
			R.drawable.nodpi_dvfonts
			R.drawable.nodpi_easydice
			R.drawable.nodpi_easytoken
			R.drawable.nodpi_easyxkcd
			R.drawable.nodpi_eddymalou
			R.drawable.nodpi_effalerts
			R.drawable.nodpi_elementary
			R.drawable.nodpi_enigmandroid
			R.drawable.nodpi_ensichat
			R.drawable.nodpi_enumbers
			R.drawable.nodpi_episodes
			R.drawable.nodpi_epubreader
			R.drawable.nodpi_equate
			R.drawable.nodpi_etarcalendar
			R.drawable.nodpi_exchange
			R.drawable.nodpi_facebooknotifications
			R.drawable.nodpi_fastergps
			R.drawable.nodpi_fblite
			R.drawable.nodpi_fbreader
			R.drawable.nodpi_fdprivileged
			R.drawable.nodpi_fdroid
			R.drawable.nodpi_feedhive
			R.drawable.nodpi_fennec
			R.drawable.nodpi_ffreddit
			R.drawable.nodpi_ffupdater
			R.drawable.nodpi_fileexplorer
			R.drawable.nodpi_filemanager
			R.drawable.nodpi_filemanagerpro
			R.drawable.nodpi_filemanagersc
			R.drawable.nodpi_findmyphone
			R.drawable.nodpi_firefox
			R.drawable.nodpi_firewall
			R.drawable.nodpi_floatingstickies
			R.drawable.nodpi_flym
			R.drawable.nodpi_fmradio
			R.drawable.nodpi_spiritf
			R.drawable.nodpi_focal
			R.drawable.nodpi_forecastie
			R.drawable.nodpi_forkhub
			R.drawable.nodpi_fortunes
			R.drawable.nodpi_freeminer
			R.drawable.nodpi_freeshisen
			R.drawable.nodpi_friendica
			R.drawable.nodpi_frozenbuble
			R.drawable.nodpi_ftpserver
			R.drawable.nodpi_gadgetbridge
			R.drawable.nodpi_galaxyzoo
			R.drawable.nodpi_gallery
			R.drawable.nodpi_gameboid
			R.drawable.nodpi_gappsbrowser
			R.drawable.nodpi_gearshift
			R.drawable.nodpi_getbackgps
			R.drawable.nodpi_ghostcommander
			R.drawable.nodpi_gigaget
			R.drawable.nodpi_github
			R.drawable.nodpi_gitlab
			R.drawable.nodpi_gloomydungeons
			R.drawable.nodpi_gltron
			R.drawable.nodpi_gnucash
			R.drawable.nodpi_gnuprivacyguard
			R.drawable.nodpi_gobandroid
			R.drawable.nodpi_goblim
			R.drawable.nodpi_gpslogger
			R.drawable.nodpi_graph89
			R.drawable.nodpi_greenaddress
			R.drawable.nodpi_greenbits
			R.drawable.nodpi_gsmmap
			R.drawable.nodpi_gtalksms
			R.drawable.nodpi_hackerskeyboard
			R.drawable.nodpi_hashpass
			R.drawable.nodpi_hayai
			R.drawable.nodpi_heartobserve
			R.drawable.nodpi_help
			R.drawable.nodpi_hexiano
			R.drawable.nodpi_hn
			R.drawable.nodpi_holocounter
			R.drawable.nodpi_holokenmod
			R.drawable.nodpi_hwmanager
			R.drawable.nodpi_i2p
			R.drawable.nodpi_icecat
			R.drawable.nodpi_icsdroid
			R.drawable.nodpi_identiconizer
			R.drawable.nodpi_ifixit
			R.drawable.nodpi_imapnotes
			R.drawable.nodpi_impeller
			R.drawable.nodpi_impression
			R.drawable.nodpi_impressremote
			R.drawable.nodpi_imsicatcher
			R.drawable.nodpi_intentexplode
			R.drawable.nodpi_intheclear
			R.drawable.nodpi_ionotepad
			R.drawable.nodpi_irssiconnectbot
			R.drawable.nodpi_jadcompass
			R.drawable.nodpi_jamendo
			R.drawable.nodpi_jaws
			R.drawable.nodpi_jupiterbroadcast
			R.drawable.nodpi_justplayer
			R.drawable.nodpi_k9mail
			R.drawable.nodpi_kalgebra
			R.drawable.nodpi_kanadrill
			R.drawable.nodpi_kanji
			R.drawable.nodpi_kdeconnect
			R.drawable.nodpi_keepass2android
			R.drawable.nodpi_keepassdroid
			R.drawable.nodpi_keepscore
			R.drawable.nodpi_kerneladiutor
			R.drawable.nodpi_keypadmapper
			R.drawable.nodpi_kisslauncher
			R.drawable.nodpi_kiwix
			R.drawable.nodpi_kodi
			R.drawable.nodpi_kolabnotes
			R.drawable.nodpi_kontalk
			R.drawable.nodpi_kore
			R.drawable.nodpi_kungfoobarracuda
			R.drawable.nodpi_lcamera
			R.drawable.nodpi_lesserpad
			R.drawable.nodpi_lexica
			R.drawable.nodpi_liberario
			R.drawable.nodpi_libreoffice
			R.drawable.nodpi_libretasks
			R.drawable.nodpi_lightningbrowser
			R.drawable.nodpi_lildebi
			R.drawable.nodpi_linconnect
			R.drawable.nodpi_linphone
			R.drawable.nodpi_linuxdeploy
			R.drawable.nodpi_listmyapps
			R.drawable.nodpi_lkeyboard
			R.drawable.nodpi_localcalendar
			R.drawable.nodpi_locationprivacy
			R.drawable.nodpi_lockclock
			R.drawable.nodpi_logicaldefence
			R.drawable.nodpi_loopboard
			R.drawable.nodpi_loophabits
			R.drawable.nodpi_lumicall
			R.drawable.nodpi_mahjonggbuilder
			R.drawable.nodpi_mail
			R.drawable.nodpi_manman
			R.drawable.nodpi_mapsme
			R.drawable.nodpi_markers
			R.drawable.nodpi_materialplayer
			R.drawable.nodpi_mathdoku
			R.drawable.nodpi_mathtools
			R.drawable.nodpi_matrixconsole
			R.drawable.nodpi_maxima
			R.drawable.nodpi_maxsmain
			R.drawable.nodpi_meditationassistant
			R.drawable.nodpi_mercury
			R.drawable.nodpi_mibandnotifier
			R.drawable.nodpi_micopi
			R.drawable.nodpi_midisheetmusic
			R.drawable.nodpi_mifare
			R.drawable.nodpi_minetest
			R.drawable.nodpi_minilens
			R.drawable.nodpi_miniopenwlanmap
			R.drawable.nodpi_ministro
			R.drawable.nodpi_minumanga
			R.drawable.nodpi_mirakel
			R.drawable.nodpi_miros
			R.drawable.nodpi_mitzuli
			R.drawable.nodpi_mlmanager
			R.drawable.nodpi_mobilewebcam
			R.drawable.nodpi_moneybalance
			R.drawable.nodpi_movecerts
			R.drawable.nodpi_movim
			R.drawable.nodpi_mozstumbler
			R.drawable.nodpi_mpdroid
			R.drawable.nodpi_mtgfamiliar
			R.drawable.nodpi_multirommgr
			R.drawable.nodpi_mupdf
			R.drawable.nodpi_music
			R.drawable.nodpi_mustard
			R.drawable.nodpi_mustardmod
			R.drawable.nodpi_muzei
			R.drawable.nodpi_myapplist
			R.drawable.nodpi_mybanq
			R.drawable.nodpi_myexpenses
			R.drawable.nodpi_myownnotes
			R.drawable.nodpi_myposition
			R.drawable.nodpi_mythdroid
			R.drawable.nodpi_mythmote
			R.drawable.nodpi_mytronome
			R.drawable.nodpi_narau
			R.drawable.nodpi_navit
			R.drawable.nodpi_netguard
			R.drawable.nodpi_netmbuddy
			R.drawable.nodpi_netstat
			R.drawable.nodpi_networkdiscovery
			R.drawable.nodpi_networklog
			R.drawable.nodpi_networkmapper
			R.drawable.nodpi_newpipe
			R.drawable.nodpi_newsblur
			R.drawable.nodpi_nicecompass
			R.drawable.nodpi_nlpbackend
			R.drawable.nodpi_nlpconfig
			R.drawable.nodpi_nonsensenotepad
			R.drawable.nodpi_notecipher
			R.drawable.nodpi_notepad
			R.drawable.nodpi_notificationnotes
			R.drawable.nodpi_nounours
			R.drawable.nodpi_ntpsync
			R.drawable.nodpi_oandbackup
			R.drawable.nodpi_oasvn
			R.drawable.nodpi_obscuracam
			R.drawable.nodpi_obsqr
			R.drawable.nodpi_ocreader
			R.drawable.nodpi_octodroid
			R.drawable.nodpi_omninotes
			R.drawable.nodpi_onetime
			R.drawable.nodpi_openbikesharing
			R.drawable.nodpi_opencamera
			R.drawable.nodpi_opencvengine
			R.drawable.nodpi_opendocumentreader
			R.drawable.nodpi_openexplorer
			R.drawable.nodpi_openflood
			R.drawable.nodpi_openimgur
			R.drawable.nodpi_openkeychain
			R.drawable.nodpi_openlaw
			R.drawable.nodpi_openlinkwith
			R.drawable.nodpi_openmensa
			R.drawable.nodpi_opennotescanner
			R.drawable.nodpi_openredmine
			R.drawable.nodpi_opentraining
			R.drawable.nodpi_openvpn
			R.drawable.nodpi_openvpnsettings
			R.drawable.nodpi_openwlanmap
			R.drawable.nodpi_opesudoku
			R.drawable.nodpi_orbot
			R.drawable.nodpi_orfox
			R.drawable.nodpi_orwall
			R.drawable.nodpi_orweb
			R.drawable.nodpi_oscilloscope
			R.drawable.nodpi_osmand
			R.drawable.nodpi_osmbugs
			R.drawable.nodpi_osmonitor
			R.drawable.nodpi_osmtracker
			R.drawable.nodpi_osmuploader
			R.drawable.nodpi_otaupdate
			R.drawable.nodpi_otp
			R.drawable.nodpi_otpauth
			R.drawable.nodpi_overchan
			R.drawable.nodpi_owncloud
			R.drawable.nodpi_owncloudbeta
			R.drawable.nodpi_owncloudnews
			R.drawable.nodpi_owncloudnotes
			R.drawable.nodpi_owncloudsms
			R.drawable.nodpi_packlist
			R.drawable.nodpi_paddletennis
			R.drawable.nodpi_pageturner
			R.drawable.nodpi_palemoon
			R.drawable.nodpi_passandroid
			R.drawable.nodpi_passwdsafe
			R.drawable.nodpi_pdfreader
			R.drawable.nodpi_pedometer
			R.drawable.nodpi_pedometer2
			R.drawable.nodpi_performancecontrol
			R.drawable.nodpi_periodical
			R.drawable.nodpi_persiancalendar
			R.drawable.nodpi_pftpd
			R.drawable.nodpi_phone
			R.drawable.nodpi_piano
			R.drawable.nodpi_pipepanic
			R.drawable.nodpi_pixeldungeon
			R.drawable.nodpi_plumble
			R.drawable.nodpi_pocketmaps
			R.drawable.nodpi_podax
			R.drawable.nodpi_podlisten
			R.drawable.nodpi_politedroid
			R.drawable.nodpi_pomodoro
			R.drawable.nodpi_portauthority
			R.drawable.nodpi_ppsspp
			R.drawable.nodpi_practicehub
			R.drawable.nodpi_prboom
			R.drawable.nodpi_prefmanager
			R.drawable.nodpi_providersmedia
			R.drawable.nodpi_puma
			R.drawable.nodpi_pwdhash
			R.drawable.nodpi_pwdstore
			R.drawable.nodpi_pyload
			R.drawable.nodpi_qksms
			R.drawable.nodpi_qksmspink
			R.drawable.nodpi_qrscanner
			R.drawable.nodpi_qrstream
			R.drawable.nodpi_quasseldroid
			R.drawable.nodpi_quickdic
			R.drawable.nodpi_quickdroid
			R.drawable.nodpi_quicklyric
			R.drawable.nodpi_quranandroid
			R.drawable.nodpi_radiobeacon
			R.drawable.nodpi_rainwave
			R.drawable.nodpi_receipts
			R.drawable.nodpi_recurrence
			R.drawable.nodpi_recursiverunner
			R.drawable.nodpi_redditslide
			R.drawable.nodpi_redmoon
			R.drawable.nodpi_redpanal
			R.drawable.nodpi_redphone
			R.drawable.nodpi_redreader
			R.drawable.nodpi_regex
			R.drawable.nodpi_remotekeyboard
			R.drawable.nodpi_repay
			R.drawable.nodpi_retrobreaker
			R.drawable.nodpi_ring
			R.drawable.nodpi_ringdroid
			R.drawable.nodpi_ripple
			R.drawable.nodpi_rmaps
			R.drawable.nodpi_rootverifier
			R.drawable.nodpi_rotationmanager
			R.drawable.nodpi_rpn
			R.drawable.nodpi_runnerup
			R.drawable.nodpi_sage
			R.drawable.nodpi_sand
			R.drawable.nodpi_satstat
			R.drawable.nodpi_saveforoffline
			R.drawable.nodpi_schessclock
			R.drawable.nodpi_scid
			R.drawable.nodpi_scrabble
			R.drawable.nodpi_screencast
			R.drawable.nodpi_screennotifications
			R.drawable.nodpi_sdscanner
			R.drawable.nodpi_seadroid2
			R.drawable.nodpi_searchtool
			R.drawable.nodpi_secdroid
			R.drawable.nodpi_secrecy
			R.drawable.nodpi_sendreduced
			R.drawable.nodpi_sendwithftp
			R.drawable.nodpi_sensorssandbox
			R.drawable.nodpi_seriesguide
			R.drawable.nodpi_servestream
			R.drawable.nodpi_settings
			R.drawable.nodpi_settings2
			R.drawable.nodpi_sfen
			R.drawable.nodpi_sgit
			R.drawable.nodpi_shadereditor
			R.drawable.nodpi_shadowsocks
			R.drawable.nodpi_sharetoclipboard
			R.drawable.nodpi_shareviahttp
			R.drawable.nodpi_shatteredpixel
			R.drawable.nodpi_shoppinglist
			R.drawable.nodpi_sicmuplayer
			R.drawable.nodpi_sieben
			R.drawable.nodpi_signal
			R.drawable.nodpi_signalgenerator
			R.drawable.nodpi_simplealarm
			R.drawable.nodpi_simpleexplorer
			R.drawable.nodpi_simplerss
			R.drawable.nodpi_simpletask
			R.drawable.nodpi_simtk
			R.drawable.nodpi_sipdroid
			R.drawable.nodpi_sismicsreader
			R.drawable.nodpi_slfms
			R.drawable.nodpi_slightbackup
			R.drawable.nodpi_smarterwifimanager
			R.drawable.nodpi_smartnavi
			R.drawable.nodpi_sms
			R.drawable.nodpi_sms2
			R.drawable.nodpi_smsbackup
			R.drawable.nodpi_smssecure
			R.drawable.nodpi_snooperstopper
			R.drawable.nodpi_snoopsnitch
			R.drawable.nodpi_solitaire
			R.drawable.nodpi_solitairecg
			R.drawable.nodpi_soundrecorder
			R.drawable.nodpi_soundwaves
			R.drawable.nodpi_sparserss
			R.drawable.nodpi_sparss
			R.drawable.nodpi_speedmeter
			R.drawable.nodpi_squeez
			R.drawable.nodpi_standalonecalendar
			R.drawable.nodpi_stardroid
			R.drawable.nodpi_steamgifts
			R.drawable.nodpi_subsonic
			R.drawable.nodpi_sudokufree
			R.drawable.nodpi_sudoq
			R.drawable.nodpi_sudowars
			R.drawable.nodpi_superuser
			R.drawable.nodpi_svgviewer
			R.drawable.nodpi_swiftnotes
			R.drawable.nodpi_swisschess
			R.drawable.nodpi_synapse
			R.drawable.nodpi_syncthing
			R.drawable.nodpi_synergy
			R.drawable.nodpi_systemappmover
			R.drawable.nodpi_tabulae
			R.drawable.nodpi_tacere
			R.drawable.nodpi_tags
			R.drawable.nodpi_tanksoffreedom
			R.drawable.nodpi_tasks
			R.drawable.nodpi_tasks2
			R.drawable.nodpi_taskwarrior
			R.drawable.nodpi_td
			R.drawable.nodpi_teatimer
			R.drawable.nodpi_telegram
			R.drawable.nodpi_terminal
			R.drawable.nodpi_terminalemulator
			R.drawable.nodpi_terminightor
			R.drawable.nodpi_termux
			R.drawable.nodpi_testnet3
			R.drawable.nodpi_textfiction
			R.drawable.nodpi_textsecure
			R.drawable.nodpi_textwarrior
			R.drawable.nodpi_themes
			R.drawable.nodpi_tickmate
			R.drawable.nodpi_tigase
			R.drawable.nodpi_timber
			R.drawable.nodpi_timeriffic
			R.drawable.nodpi_tinfoilfb
			R.drawable.nodpi_tinfoiltw
			R.drawable.nodpi_tintbrowser
			R.drawable.nodpi_togozip
			R.drawable.nodpi_tomdroid
			R.drawable.nodpi_torch
			R.drawable.nodpi_torchlight
			R.drawable.nodpi_traccar
			R.drawable.nodpi_transdroid
			R.drawable.nodpi_transdroidsearch
			R.drawable.nodpi_transdrone
			R.drawable.nodpi_transistor
			R.drawable.nodpi_transportr
			R.drawable.nodpi_trebuchet
			R.drawable.nodpi_trickytripper
			R.drawable.nodpi_trolly
			R.drawable.nodpi_ttcomics
			R.drawable.nodpi_ttrss
			R.drawable.nodpi_tuner
			R.drawable.nodpi_turboeditor
			R.drawable.nodpi_turtl
			R.drawable.nodpi_tutanota
			R.drawable.nodpi_tuxemon
			R.drawable.nodpi_tuxpaint
			R.drawable.nodpi_tuxpaintconfig
			R.drawable.nodpi_tuxrider
			R.drawable.nodpi_tvkill
			R.drawable.nodpi_twidere
			R.drawable.nodpi_twittnuker
			R.drawable.nodpi_uget
			R.drawable.nodpi_ukweather
			R.drawable.nodpi_umbrella
			R.drawable.nodpi_vanillamusic
			R.drawable.nodpi_vectorpinball
			R.drawable.nodpi_vespucci
			R.drawable.nodpi_videoeditor
			R.drawable.nodpi_vimtouch
			R.drawable.nodpi_visualbitcoin
			R.drawable.nodpi_vlc
			R.drawable.nodpi_voicedialer
			R.drawable.nodpi_voicerecorder
			R.drawable.nodpi_vudroid
			R.drawable.nodpi_vxconnectbot
			R.drawable.nodpi_wakeonlan
			R.drawable.nodpi_wallabag
			R.drawable.nodpi_wallpaper
			R.drawable.nodpi_wally
			R.drawable.nodpi_weathernotification
			R.drawable.nodpi_webapps
			R.drawable.nodpi_webcamviewer
			R.drawable.nodpi_webopac
			R.drawable.nodpi_webtube
			R.drawable.nodpi_weechat
			R.drawable.nodpi_wetter
			R.drawable.nodpi_whatsappbetaupdater
			R.drawable.nodpi_wheelmap
			R.drawable.nodpi_whisperpush
			R.drawable.nodpi_whohasmystuff
			R.drawable.nodpi_wifianalyzer
			R.drawable.nodpi_wificamera
			R.drawable.nodpi_wifikeyboard
			R.drawable.nodpi_wifikeyshare
			R.drawable.nodpi_wifikeyview
			R.drawable.nodpi_wifimatic
			R.drawable.nodpi_wifiwarning
			R.drawable.nodpi_wigle
			R.drawable.nodpi_wikijourney
			R.drawable.nodpi_wikimedia
			R.drawable.nodpi_wikipedia
			R.drawable.nodpi_wiktionary
			R.drawable.nodpi_wishperpush
			R.drawable.nodpi_wordpress
			R.drawable.nodpi_worktime
			R.drawable.nodpi_worldclock
			R.drawable.nodpi_wpgen
			R.drawable.nodpi_wppolice
			R.drawable.nodpi_writeily
			R.drawable.nodpi_xabber
			R.drawable.nodpi_xbmc
			R.drawable.nodpi_xdafeedreader
			R.drawable.nodpi_xkcdviewer
			R.drawable.nodpi_xposed
			R.drawable.nodpi_xprivacy
			R.drawable.nodpi_xsdl
			R.drawable.nodpi_yaab
			R.drawable.nodpi_yaacc
			R.drawable.nodpi_yaaic
			R.drawable.nodpi_yahtzee
			R.drawable.nodpi_yaxim
			R.drawable.nodpi_yubico

    };

    private ArrayList<LinearLayout> layoutList = new ArrayList<>();
    private ArrayList<ImageView> imageList = new ArrayList<>();

    @Override
    protected void onCreate( Bundle savedInstanceState ) {

        super.onCreate( savedInstanceState );

        if( IceScreenUtils.isPortrait( getApplicationContext() ) )
            createLayout( 7 );
        else {
            createLayout( 12 );
        }
    }

    private void createLayout( int width ) {

        float scale = IceScreenUtils.densityScale( getApplicationContext() );
        int margin = 16 * Math.round( scale );

        LinearLayout.LayoutParams baseParams = new LinearLayout.LayoutParams( LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT );
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams( LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT );
        LinearLayout.LayoutParams containerParams = new LinearLayout.LayoutParams( LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT );
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams( LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f );

        ScrollView baseScroller = new ScrollView( this );
        baseScroller.setLayoutParams( baseParams );
        baseScroller.setBackgroundColor( 0xff000000 );
        setContentView( baseScroller );
        baseScroller.setVisibility( View.VISIBLE );

        // display width hack

        Rect windowRect = new Rect();
        baseScroller.getWindowVisibleDisplayFrame(windowRect);
        int windowWidth = windowRect.right - windowRect.left;

        LinearLayout baseLayout = new LinearLayout( this );
        baseLayout.setOrientation( LinearLayout.VERTICAL );
        baseLayout.setLayoutParams( layoutParams );
        baseLayout.setPadding( margin, margin, 0, 0 );
        baseScroller.addView( baseLayout );

        for( int i =0; i < mImages.length; i++ ) {

            if( ( i%width ) == 0 ) {

                layoutList.add((i / width), new LinearLayout(this));
                layoutList.get(i / width).setOrientation(LinearLayout.HORIZONTAL);
                layoutList.get(i / width).setGravity(Gravity.LEFT);
                layoutList.get(i / width).setLayoutParams(containerParams);

                baseLayout.addView(layoutList.get(i / width));
            }

            imageList.add( i, new ImageView( this ) );
            imageList.get(i).setLayoutParams( imageParams );
            imageList.get(i).setScaleType( ImageView.ScaleType.FIT_XY );
            imageList.get(i).setPadding( 0, 0, margin, margin );
            IceImageUtils.bitmapLoadAsync( imageList.get(i), getApplicationContext().getResources(), mImages[i], ( windowWidth / width ) - ( margin * width + margin ) / width, ( windowWidth / width ) - ( margin * width + margin ) / width );
            imageList.get(i).setAdjustViewBounds( true );
            layoutList.get( i / width ).addView( imageList.get(i) );
        }
    }
}