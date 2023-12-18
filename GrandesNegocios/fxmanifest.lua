fx_version 'cerulean'
game 'gta5'
author 'Petris'
lua54 'yes'
version '1.0'

shared_script('petris_cfg.lua')
client_script('death.lua')
client_script('petris_cl.lua')
server_script('petris_sv.lua')

ui_page('ui/ui.html')

files {
    'ui/ui.html',
    'ui/style.css',
    'ui/script.js',
    'ui/img/*.png',
    'ui/img/*.jpg',
    'ui/img/*.gif',
}

escrow_ignore {
    'petris_cfg.lua'
}