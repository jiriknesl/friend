(ns friend.core
  (:require overtone.at-at)
  
  )

; What is it
; 
; Personal space for various data 
; In a format where everything is customizable
; everything is available
; everything is scriptable (why?)

; Notion (todo, notes, zettelkasten, journal, checklists, custom data, search) + timers + GCal (events)


; TODO - add YesQL
; data + event sourcing pro edits
; TODO - add todos (tasks, projects, tags)
; CRUD-projects, CRUD-tasks, filters, today, custom views
; TODO - add calendar (repeating_calendar_items, calendar_items)
; CRUD, repeating events, today 
; TODO - add notes (notes)
; CRUD & filter notes
; TODO - add timers (timers)
; CRUD timers, templates, 5m, timers, stop

; (def timer-pool (overtone.at-at/mk-pool))
; (defn timer [minutes] (start-timer minutes))

; TODO - add journal (journal_entries)
; CRUD journal
; TODO - add zettelkasten (zettelkasten_entries, zettelkasten_links, zettelkasten_tags)
; CRUD zettel, follow links, graph
; TODO - add notifications (notifications)
; send notification
; TODO - add markdown (md_documents)
; CRUD & view MD
; TODO - add vim editing (temp_files)
; edit text in Vim
; TODO - add checklists (checklists, checklist_sections, checklist_items, runned_checklists, runned_checklist_sections, runned_checklist_items)
; CRUD checklists & runned checklists
; TODO - load wikipedia (wikipedia_articles)
; read & refresh wiki
; TODO - add migrations (migrations, db_version)
; migrate up down
; TODO - test with other data sharing services (Dropbox, iCloud, Google Drive...)
; on-change
; TODO - calc + predict
; timeseries, calculator (infix)
; TODO - general storage of numbers and data + filter, sort, custome views
; easy way to load data (CSV, XLS, JSON, XML...)
; TODO - data sources fromthe world (weather, economic data)
; various datasources
; TODO - on-event handlery (kdyz se neco zmeni, prida, tak to neco udela)
; TODO - autocomplete, hints...
; TODO - fulltext search across all data
; TODO - run in Clojupyter Jupyter kernel for Clj

; maybe TODO - mobile web UI
; maybe TODO - encryption
; maybe TODO - integrace
; maybe TODO - distribuce databaze + jupyter + clojupyter + clj jako Docker

; modul = SQL file, metadata middleware; print interface, custom funkce, dokumentace, testy, migrace

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
