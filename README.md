# Synopsis <a name="Synopsis"></a>

This is a plugin for [PS3 Media Server](http://code.google.com/p/ps3mediaserver/) that adds support for MEncoder edit decision lists (EDLs).

# Prerequisites <a name="Prerequisites"></a>

This plugin should work on all platforms supported by PS3 Media Server.

Currently, it requires an unreleased PMS build (revision >= 604).

These instructions assume you have the latest version of [PS3 Media Server](http://www.ps3mediaserver.org/forum/viewtopic.php?f=6&t=3507&p=36904#p36904) (PMS) and the latest version of [Java](http://www.java.com/en/download/index.jsp).

# Installation <a href="Install"></a>

* stop PMS
* Download and save the [plugin](https://github.com/downloads/chocolateboy/PMS-EDL/pms-edl-1.0.0.jar) to the PMS `plugins` directory
* Restart PMS

# Uninstalling <a href="Uninstall"></a>

* stop PMS
* remove the jar file from the `plugins` directory
* restart PMS

# Upgrading <a href="Upgrade"></a>

* stop PMS
* replace the old jar file with the new version
* restart PMS

# Usage <a href="Usage"></a>

There are two ways to name an EDL: per-file and per-folder. Per-file EDLs take precedence over per-folder EDLs.

## Per-file

To create file-specific EDLs, place each `.edl` file in the same folder as the video it applies to. The .edl file must have the same filename as the video with an `.edl` extension appended e.g.

* Big Buck Bunny.mp4
* Big Buck Bunny.mp4.edl

## Per-folder

To create an EDL that applies to all videos in a folder, create a file called `folder.edl`.

* Episode 1x01.mp4
* Episode 1x02.mp4
* folder.edl

EDLs require MEncoder, so if it is not being used automatically, it will need to be invoked via the `#--TRANSCODE--#` folder.

For information on creating EDL files, see [here](http://www.mplayerhq.hu/DOCS/HTML/en/edl.html).

# Building <a href="Build"></a>

To build the plugin from source:

* install the latest version of [gradle](http://www.gradle.org/downloads.html)
* create a subdirectory called `lib/` and add/symlink a recent (>= r604) `pms.jar` there
* run the default `jar` task by entering the command: `gradle`

The generated jar file can be found in `build/libs`.

# Troubleshooting and Support <a name="Help"></a>
* Check the PMS `debug.log`
<!-- * For more details, discussion and troubleshooting tips, see [this thread](http://ps3mediaserver.org/forum/viewtopic.php?f=x&t=y) -->

# Version <a name="Version"></a>

1.0.0

# License <a name="License"></a>

Copyright 2011, [chocolateboy](mailto:chocolate@cpan.org).

pms-edl is free software; you can redistribute it and/or modify it under the terms of the [Artistic License 2.0](http://www.opensource.org/licenses/artistic-license-2.0.php).
