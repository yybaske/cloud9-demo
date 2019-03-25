Rails.application.routes.draw do
  get 'welcome/index'
  
  # 標準的なルーティングを宣言する
  resources :articles
  
  root 'welcome#index'
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
end
